package br.uerj.ime.dados;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Telefone {

    @Id
    @GeneratedValue
    private Long codigo;

    private String operadora;

    private String ddd;

    private String numero;

}
