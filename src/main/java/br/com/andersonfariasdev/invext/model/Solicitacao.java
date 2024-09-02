package br.com.andersonfariasdev.invext.model;

import br.com.andersonfariasdev.invext.dto.enumeration.TipoSolicitacao;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Table(name = "solicitacoes")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
public class Solicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoSolicitacao tipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "atendente_id")
    @Setter
    private Atendente atendente;

    @Column(nullable = false)
    private LocalDateTime dataCriacao;

    @Setter
    private String status;

}


