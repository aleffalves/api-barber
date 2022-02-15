package com.github.aleffalves.apibarber.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "SENHA", nullable = false)
    private String senha;

    @Column(name = "CPF", nullable = false)
    @CPF
    private String cpf;

    @Column(unique = true, name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "DATA_ANIVERSARIO", nullable = false)
    private Date dataAniversario;

    @Column(name = "TELEFONE", nullable = false)
    private String telefone;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name =  "USUARIO_ROLES", joinColumns = @JoinColumn(name = "USER_ID"))
    @Column(name = "ROLE_ID", nullable = false)
    private List<String> roles = new ArrayList<>();

    public Usuario(){
    }

    public Usuario(Integer id, String nome, String senha, String cpf, String email, Date dataAniversario, String telefone, List<String> roles) {
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
