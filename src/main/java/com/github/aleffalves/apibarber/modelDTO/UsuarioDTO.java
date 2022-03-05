package com.github.aleffalves.apibarber.modelDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuarioDTO {

    private Integer id;
    private String nome;
    private String senha;
    private String cpf;
    private String email;
    private Date dataAniversario;
    private String telefone;
    private List<String> roles = new ArrayList<>();

    public UsuarioDTO(Integer id, String nome, String senha, String cpf, String email, Date dataAniversario, String telefone, List<String> roles) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.email = email;
        this.dataAniversario = dataAniversario;
        this.telefone = telefone;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
