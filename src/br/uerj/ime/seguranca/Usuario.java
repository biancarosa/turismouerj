package br.uerj.ime.seguranca;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long codigo;

    private String login;
    private String senha;

    @OneToMany
    private Set<Permissao> permissoes;

}