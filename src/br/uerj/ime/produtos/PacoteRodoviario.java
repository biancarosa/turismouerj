package br.uerj.ime.produtos;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PacoteRodoviario extends Pacote {

    private String tipoOnibus;
}
