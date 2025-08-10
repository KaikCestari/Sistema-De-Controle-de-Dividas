package com.devkaik.SistemaDividas.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Email obrigatório")
    @Column(unique = true) // garante que não terá duplicados
    private String email;
    @NotBlank(message = "Senha obrigatória")
    private String senha;
    private String nome;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Dividas> dividas;



    public User() {}


    public User(String email, String senha, String nome) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
    }

    public User(Long id, String email, String senha, String nome, List<Dividas> dividas) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.dividas = dividas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

