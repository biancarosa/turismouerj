package br.uerj.ime.interno;

import br.uerj.ime.dados.Endereco;
import br.uerj.ime.dados.Telefone;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Funcionario extends Gerente {

    private String nome;

    private String cargo;

    private Integer numeroVendas;

    @OneToOne
    private Endereco endereco;

    @OneToMany
    private Set<Telefone> telefone;

    @ManyToOne
    private Gerente gerente;

}
