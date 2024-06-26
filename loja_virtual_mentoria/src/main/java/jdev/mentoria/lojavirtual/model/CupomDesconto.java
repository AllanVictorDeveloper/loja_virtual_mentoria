package jdev.mentoria.lojavirtual.model;


import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cupom_desconto")
@SequenceGenerator(name = "seq_cupom_desconto", sequenceName = "seq_cupom_desconto", allocationSize = 1, initialValue = 1)
public class CupomDesconto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cupom_desconto")
    private Long id;


    private String codDesconto;

    private BigDecimal valorRealDesconto;
    private BigDecimal ValorPorcentDesconto;

    @Temporal(TemporalType.DATE)
    private Date dataValidadeCupom;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodDesconto() {
        return codDesconto;
    }

    public void setCodDesconto(String codDesconto) {
        this.codDesconto = codDesconto;
    }

    public BigDecimal getValorRealDesconto() {
        return valorRealDesconto;
    }

    public void setValorRealDesconto(BigDecimal valorRealDesconto) {
        this.valorRealDesconto = valorRealDesconto;
    }

    public BigDecimal getValorPorcentDesconto() {
        return ValorPorcentDesconto;
    }

    public void setValorPorcentDesconto(BigDecimal valorPorcentDesconto) {
        ValorPorcentDesconto = valorPorcentDesconto;
    }

    public Date getDataValidadeCupom() {
        return dataValidadeCupom;
    }

    public void setDataValidadeCupom(Date dataValidadeCupom) {
        this.dataValidadeCupom = dataValidadeCupom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CupomDesconto that = (CupomDesconto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
