package br.com.mcv.Missao.Cristo.Volta.domain.cadastro;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class MembroDto implements Serializable {

    private static final long serialVersionUID = 2754496071874539088L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private DadosPessoaisDto dadosPessoais;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ParentescoDto parentesco;

    @Column(length = 3)
    private Boolean batizado;

    @Column(name = "data_batizado")
    private String dataBatizado;

    @Column(name = "situacao_atual", length = 7)
    private String situacaoAtual;

    @Column(length = 20)
    private String categoria;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private MinisterioDto ministerio;

    @Column(name = "faixa_etaria", length = 20)
    private String faixaEtaria;

    @Column(length = 250)
    private String informacoes;

}
