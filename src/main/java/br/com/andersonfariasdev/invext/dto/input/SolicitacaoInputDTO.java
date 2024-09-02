package br.com.andersonfariasdev.invext.dto.input;

import br.com.andersonfariasdev.invext.dto.enumeration.TipoSolicitacao;
import lombok.Data;

@Data
public class SolicitacaoInputDTO {
    private TipoSolicitacao tipo;
    private String status;
}
