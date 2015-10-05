package br.uerj.ime.seguranca;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long codigo;

    private String login;
    private String senha;

}