package com.github.aleffalves.apibarber.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "AGENDAMENTO")
public class Agendamento {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
    private Usuario idUsuario;

    @Column(name = "DATA_AGENDADA")
    private Date dataAgendada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_HORARIO", referencedColumnName = "ID")
    private Horarios idHorario;

    @Column(name = "VALOR_TOTAL")
    private BigDecimal valorTotal;

    @Column(name = "DATA_DO_AGENDAMENTO")
    private Date dataDoAgendamento;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICOS", referencedColumnName = "ID")
    private List<Servicos> servicos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(Date dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public Horarios getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Horarios idHorario) {
        this.idHorario = idHorario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataDoAgendamento() {
        return dataDoAgendamento;
    }

    public void setDataDoAgendamento(Date dataDoAgendamento) {
        this.dataDoAgendamento = dataDoAgendamento;
    }

    public List<Servicos> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servicos> servicos) {
        this.servicos = servicos;
    }
}
