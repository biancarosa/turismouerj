package br.uerj.ime.dados;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco {

    @Id
    @GeneratedValue
    private Long codigo;

    private String logradouro;

    private String bairro;

    private String cidade;

    private String uf;

    private String complemento;

    private String cep;

}
