package br.com.mcv.Missao.Cristo.Volta.domain.cadastro;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class DadosPessoaisDto {

    private static final long serialVersionUID = 2754496071874539088L;

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDadosPessoais;

    @Column(name = "nome_completo", length = 200)
    private String nomeCompleto;

    @Column(length = 100)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private EnderecoDto endereco;

    @Column(length = 20)
    private String telefone;

    @Column()
    private String dataNascimento;

    @Column(name = "estado_civil", length = 20)
    private String estadoCivil;

    @Column(length = 9)
    private String rg;

    @Column(length = 11)
    private String cpf;

}
