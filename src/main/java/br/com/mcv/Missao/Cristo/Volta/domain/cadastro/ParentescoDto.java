package br.com.mcv.Missao.Cristo.Volta.domain.cadastro;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class ParentescoDto {

    private static final long serialVersionUID = 2754496071874539088L;

    @Id
    @Column()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String parentesco;

    @Column(length = 100)
    private String nome;
}
