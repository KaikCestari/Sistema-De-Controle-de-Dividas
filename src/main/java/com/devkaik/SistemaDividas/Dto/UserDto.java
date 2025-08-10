package com.devkaik.SistemaDividas.Dto;

import java.util.List;

public class UserDto {

        private Long id;
        private String nome;
        private String email;

        private List<DividasDto> dividas;

    public UserDto() {
    }

    public UserDto(Long id, String nome, String email, List<DividasDto> dividas) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dividas = dividas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<DividasDto> getDividas() {
        return dividas;
    }

    public void setDividas(List<DividasDto> dividas) {
        this.dividas = dividas;
    }
}


