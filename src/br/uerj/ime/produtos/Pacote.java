package br.uerj.ime.produtos;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Pacote {

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

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getValorPorPessoa() {
        return valorPorPessoa;
    }

    public void setValorPorPessoa(Double valorPorPessoa) {
        this.valorPorPessoa = valorPorPessoa;
    }

    public Integer getPermanencia() {
        return permanencia;                                                         
    }

    public void setPermanencia(Integer permanencia) {
        this.permanencia = permanencia;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public Date getDataIdaViagem() {
        return dataIdaViagem;
    }

    public void setDataIdaViagem(Date dataIdaViagem) {
        this.dataIdaViagem = dataIdaViagem;
    }

    public Date getDataVoltaViagem() {
        return dataVoltaViagem;
    }

    public void setDataVoltaViagem(Date dataVoltaViagem) {
        this.dataVoltaViagem = dataVoltaViagem;
    }
}
