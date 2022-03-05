package com.github.aleffalves.apibarber.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "HORARIOS")
public class Horarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DATA")
    private Date data;

    @Column(name = "HORARIO")
    private Date horario;

    @Column(name = "IS_DISPONIVEL")
    private Boolean isDisponivel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Boolean getDisponivel() {
        return isDisponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        isDisponivel = disponivel;
    }
}
