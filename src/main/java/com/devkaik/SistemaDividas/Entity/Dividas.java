package com.devkaik.SistemaDividas.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_dividas")
public class Dividas {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String descricao;
private Integer valor;
private LocalDate vencimento;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;


    public Dividas() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public Dividas(Long id, String descricao, Integer valor, LocalDate vencimento, User usuario) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.vencimento = vencimento;
        this.usuario = usuario;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
