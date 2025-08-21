package com.senai.vagasfrontend.model;

public class Vaga {
    private Long id;
    private String descricao;
    private String requisitosObrigatorios;
    private String requisitosDesejaveis;
    private String remuneracao;
    private String beneficios;
    private String localTrabalho;

    // Getters and Setters
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

    public String getRequisitosObrigatorios() {
        return requisitosObrigatorios;
    }

    public void setRequisitosObrigatorios(String requisitosObrigatorios) {
        this.requisitosObrigatorios = requisitosObrigatorios;
    }

    public String getRequisitosDesejaveis() {
        return requisitosDesejaveis;
    }

    public void setRequisitosDesejaveis(String requisitosDesejaveis) {
        this.requisitosDesejaveis = requisitosDesejaveis;
    }

    public String getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(String remuneracao) {
        this.remuneracao = remuneracao;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }
}

