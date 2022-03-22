package com.github.aleffalves.apibarber.modelDTO;

public class HorariosDTO {

    private Integer id;
    private String horario;
    private Boolean isDisponivel;

    public HorariosDTO(Integer id, String horario, Boolean isDisponivel) {
        this.id = id;
        this.horario = horario;
        this.isDisponivel = isDisponivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Boolean getDisponivel() {
        return isDisponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        isDisponivel = disponivel;
    }
}
