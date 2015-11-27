package br.uerj.ime.clientes;

import br.uerj.ime.dados.Endereco;
import br.uerj.ime.dados.Telefone;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cliente {

    @Id
    private String cpf;

    private String nome;

    @OneToMany
    private Set<Telefone> telefone;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(Set<Telefone> telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
