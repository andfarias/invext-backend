package br.com.andersonfariasdev.invext.controller;

import br.com.andersonfariasdev.invext.dto.output.SolicitacaoOutputDTO;
import br.com.andersonfariasdev.invext.dto.input.SolicitacaoInputDTO;
import br.com.andersonfariasdev.invext.model.Solicitacao;
import br.com.andersonfariasdev.invext.service.SolicitacaoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/solicitacoes")
public class SolicitacaoController {

    @Autowired
    private SolicitacaoService solicitacaoService;

    @Autowired
    private ModelMapper mapper;

    @PostMapping
    public ResponseEntity<SolicitacaoOutputDTO> criarSolicitacao(
            @RequestBody SolicitacaoInputDTO solicitacao,
            UriComponentsBuilder uriBuilder
    ) {
        Solicitacao novaSolicitacao = solicitacaoService.criarSolicitacao(solicitacao);

        URI uri = uriBuilder.path("/api/solicitacoes/{id}").buildAndExpand(novaSolicitacao.getId()).toUri();
        return ResponseEntity.created(uri).body(mapper.map(solicitacao, SolicitacaoOutputDTO.class));
    }

    @GetMapping
    public ResponseEntity<List<SolicitacaoOutputDTO>> listarSolicitacoes() {
        List<SolicitacaoOutputDTO> solicitacoes = solicitacaoService.listarSolicitacoes();

        return ResponseEntity.ok(solicitacoes);
    }


    @GetMapping("/{id}")
    public ResponseEntity<SolicitacaoOutputDTO> detalhar(@PathVariable Long id)  {
        Optional<Solicitacao> solicitacao = solicitacaoService.filtra(id);

        return solicitacao.map(value ->
                        ResponseEntity.ok(mapper.map(solicitacao, SolicitacaoOutputDTO.class)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}

