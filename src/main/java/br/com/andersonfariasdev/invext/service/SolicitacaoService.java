package br.com.andersonfariasdev.invext.service;


import br.com.andersonfariasdev.invext.dto.enumeration.TipoSolicitacao;
import br.com.andersonfariasdev.invext.dto.input.SolicitacaoInputDTO;
import br.com.andersonfariasdev.invext.dto.output.SolicitacaoOutputDTO;
import br.com.andersonfariasdev.invext.model.Atendente;
import br.com.andersonfariasdev.invext.model.Solicitacao;
import br.com.andersonfariasdev.invext.model.Time;
import br.com.andersonfariasdev.invext.repository.SolicitacaoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SolicitacaoService {

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

    @Autowired
    private ModelMapper mapper;

    public Solicitacao criarSolicitacao(SolicitacaoInputDTO solicitacao) {
        return solicitacaoRepository.save(
                Solicitacao.builder()
                        .tipo(solicitacao.getTipo())
                        .dataCriacao(LocalDateTime.now())
                        .status(solicitacao.getStatus())
                        .build()
        );
    }

    public List<SolicitacaoOutputDTO> listarSolicitacoes() {
        var solicitacoes = solicitacaoRepository.findAll();

        return solicitacoes.stream()
                .map(solicitacao -> mapper.map(solicitacao, SolicitacaoOutputDTO.class))
                .collect(Collectors.toList());
    }

    public Optional<Solicitacao> filtra(Long id) {
        return solicitacaoRepository.findById(id);
    }

}

