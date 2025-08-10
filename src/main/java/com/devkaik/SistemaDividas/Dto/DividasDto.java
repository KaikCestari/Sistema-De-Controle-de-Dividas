package com.devkaik.SistemaDividas.Dto;

import java.time.LocalDate;

public class DividasDto {


        private Long id;
        private String descricao;
        private double valor;
        private LocalDate vencimento;
        private Long usuarioId;

    public DividasDto() {
    }

    public DividasDto(Long id, String descricao, double valor, LocalDate vencimento, Long usuarioId) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.vencimento = vencimento;
        this.usuarioId = usuarioId;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}




