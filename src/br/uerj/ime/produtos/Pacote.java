package br.uerj.ime.produtos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Pacote {

    @Id
    @GeneratedValue
    private Long codigo;

    private Double valorPorPessoa;

    private Integer permanencia;

    private String origem;

    private String destino;

    private Integer vagas;

    private Date dataIdaViagem;

    private Date dataVoltaViagem;
}
