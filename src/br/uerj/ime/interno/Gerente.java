package br.uerj.ime.interno;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Gerente {

    @Id
    @GeneratedValue
    private Long codigo;

}
