package br.uerj.ime.clientes;

import br.uerj.ime.dados.Endereco;
import br.uerj.ime.dados.Telefone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class Cliente {

    @Id
    private String cpf;

    private String nome;

    @OneToMany
    private Set<Telefone> telefone;

    @OneToOne
    private Endereco endereco;

}
