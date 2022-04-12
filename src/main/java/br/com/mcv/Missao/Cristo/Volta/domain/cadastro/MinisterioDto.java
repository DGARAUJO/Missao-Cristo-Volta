package br.com.mcv.Missao.Cristo.Volta.domain.cadastro;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class MinisterioDto {

    private static final long serialVersionUID = 2754496071874539088L;

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String ministerio;

    @Column(length = 100)
    private String funcao;
}
