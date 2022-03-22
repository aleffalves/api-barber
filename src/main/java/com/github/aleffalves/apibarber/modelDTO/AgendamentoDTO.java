package com.github.aleffalves.apibarber.modelDTO;

import com.github.aleffalves.apibarber.model.Horarios;
import com.github.aleffalves.apibarber.model.Servicos;
import com.github.aleffalves.apibarber.model.Usuario;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class AgendamentoDTO {

    private Integer id;
    private Usuario idUsuario;
    private Date dataAgendada;
    private Horarios idHorario;
    private BigDecimal valorTotal;
    private Date dataDoAgendamento;
    private List<Servicos> servicos;

    public AgendamentoDTO(Integer id, Usuario idUsuario, Date dataAgendada, Horarios idHorario, BigDecimal valorTotal, Date dataDoAgendamento, List<Servicos> servicos) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.dataAgendada = dataAgendada;
        this.idHorario = idHorario;
        this.valorTotal = valorTotal;
        this.dataDoAgendamento = dataDoAgendamento;
        this.servicos = servicos;
    }

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
