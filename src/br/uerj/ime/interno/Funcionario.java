package br.uerj.ime.interno;

import br.uerj.ime.dados.Endereco;
import br.uerj.ime.dados.Telefone;
import br.uerj.ime.seguranca.Usuario;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Funcionario extends Usuario {

    private String nome;

    private String cargo;

    private Integer numeroVendas;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Telefone> telefone;

    @ManyToOne
    private Gerente gerente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(Integer numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Set<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(Set<Telefone> telefone) {
        this.telefone = telefone;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Funcionario() {
        this.endereco = new Endereco();
    }


    @Override
    public String toString() {
        return this.getNome();
    }
}
