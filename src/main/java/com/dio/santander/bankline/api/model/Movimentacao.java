package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

public class Movimentacao {
    private Integer id;
    private LocalDateTime datHora;
    private String descricao;
    private Double valor;
    private MovimentacaoTipo tipo;
    
    public Integer getId() {
        return id;
    }
    public MovimentacaoTipo getTipo() {
        return tipo;
    }
    public void setTipo(MovimentacaoTipo tipo) {
        this.tipo = tipo;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDateTime getDatHora() {
        return datHora;
    }
    public void setDatHora(LocalDateTime datHora) {
        this.datHora = datHora;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
