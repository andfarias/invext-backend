package br.com.andersonfariasdev.invext.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "atendentes")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Atendente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "atendente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Solicitacao> solicitacoes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "time_id")
    private Time time;

}

