package com.github.aleffalves.apibarber.modelDTO;

import java.util.Date;

public class HorariosDTO {

    private Integer id;
    private Date data;
    private Date horario;
    private Boolean isDisponivel;

    public HorariosDTO(Integer id, Date data, Date horario, Boolean isDisponivel) {
        this.id = id;
        this.data = data;
        this.horario = horario;
        this.isDisponivel = isDisponivel;
    }

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
