package com.dio.santander.bankline.api.dto;

public class NovoCorrentista {
    private String name;
    private String cpf;
    public String getCpf() {
        return cpf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    
}
