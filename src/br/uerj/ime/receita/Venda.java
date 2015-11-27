package br.uerj.ime.receita;

import br.uerj.ime.clientes.Cliente;
import br.uerj.ime.interno.Funcionario;
import br.uerj.ime.produtos.Pacote;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Venda {

    @Id
    @GeneratedValue
    private Long codigoVenda;

    @OneToOne(cascade = CascadeType.ALL)
    private Pacote pacote;

    @OneToOne(cascade = CascadeType.ALL)
    private Funcionario funcionario;

    @OneToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

    private String tipoPagamento;

    private Integer quantidadePessoas;

    @ElementCollection
    private Set<String> nomesPassageiros;

    public Long getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(Long codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Integer getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(Integer quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public Set<String> getNomesPassageiros() {
        return nomesPassageiros;
    }

    public void setNomesPassageiros(Set<String> nomesPassageiros) {
        this.nomesPassageiros = nomesPassageiros;
    }
}
