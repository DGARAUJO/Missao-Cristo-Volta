package br.com.mcv.Missao.Cristo.Volta.domain.cadastro;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class EnderecoDto {

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEndereco;

    @Column(nullable = false, length = 120)
    private String logradouro;

    @Column(nullable = false, length = 5)
    private Integer numero;

    @Column(length = 200)
    private String complemento;

    @Column(nullable = false, length = 120)
    private String cidade;

    @Column(nullable = false, length = 20)
    private String estado;

    @Column
    private String cep;

    @Column(nullable = false, length = 20)
    private String pais;
}
