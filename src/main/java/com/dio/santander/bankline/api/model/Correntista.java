package com.dio.santander.bankline.api.model;

public class Correntista {
    private Integer id;
    private String cpf;
    private String nome;

    public String getCpf() {
        return cpf;
    }
    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
