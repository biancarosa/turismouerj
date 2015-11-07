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

    @OneToOne
    private Pacote pacote;

    @OneToOne
    private Funcionario funcionario;

    @OneToOne
    private Cliente cliente;

    private String tipoPagamento;

    private Integer quantidadePessoas;

    @ElementCollection
    private Set<String> nomesPassageiros;
}
