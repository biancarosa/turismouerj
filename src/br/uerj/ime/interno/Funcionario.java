package br.uerj.ime.interno;

import br.uerj.ime.dados.Endereco;
import br.uerj.ime.dados.Telefone;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Funcionario {

    @Id
    @GeneratedValue
    private Long codigo;

    private String nome;

    private String cargo;

    private Integer numeroVendas;

    @OneToOne
    private Endereco endereco;

    @OneToMany
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
}
