package br.com.andersonfariasdev.invext.listener;

import br.com.andersonfariasdev.invext.model.Atendente;
import br.com.andersonfariasdev.invext.model.Solicitacao;
import br.com.andersonfariasdev.invext.repository.SolicitacaoRepository;
import br.com.andersonfariasdev.invext.service.SolicitacaoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SolicitacaoConsumer {

    @Autowired
    private SolicitacaoService solicitacaoService;

    @Autowired
    private SolicitacaoRepository repository;

    @RabbitListener(queues = "solicitacoes")
    public void consume(Solicitacao solicitacao) {
        Atendente atendente = solicitacaoService.findDisponivelAtendente(solicitacao.getTipo());
        solicitacao.setAtendente(atendente);
        repository.save(solicitacao);
    }
}