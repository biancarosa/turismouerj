package br.uerj.ime.interno;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Gerente extends Funcionario {


}
