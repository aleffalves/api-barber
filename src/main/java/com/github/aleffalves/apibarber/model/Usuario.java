package com.github.aleffalves.apibarber.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "SENHA")
    private String senha;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DATA_CRIACAO")

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCriação;

    public Usuario(){

    }

    public Usuario(Integer id, String nome, String senha, String cpf, String email, LocalDate dataCriação) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.email = email;
        this.dataCriação = dataCriação;
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

    public LocalDate getDataCriação() {
        return dataCriação;
    }

    public void setDataCriação(LocalDate dataCriação) {
        this.dataCriação = dataCriação;
    }

}
