package br.com.andersonfariasdev.invext.dto.output;

import br.com.andersonfariasdev.invext.dto.enumeration.TipoSolicitacao;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SolicitacaoOutputDTO {
    private TipoSolicitacao tipo;
    private AtendenteOutputDTO atendente;
    private LocalDateTime dataCriacao;
    private String status;
}
