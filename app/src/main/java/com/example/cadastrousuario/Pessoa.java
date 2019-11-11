package com.example.cadastrousuario;

import android.widget.EditText;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;
    private String sobreNome;
    private String telefone;
    private String celular;
    private String cpf;
    private String escolaridade;
    private String endereco;
    private String bairro;
    private String estado;
    private String senha;
    private String confirmacaoSenha;

    public Pessoa() {
    }


    public Pessoa(String nome, String sobreNome, String telefone, String celular, String cpf, String escolaridade, String endereco, String bairro, String estado, String senha, String confirmacaoSenha) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.telefone = telefone;
        this.celular = celular;
        this.cpf = cpf;
        this.escolaridade = escolaridade;
        this.endereco = endereco;
        this.bairro = bairro;
        this.estado = estado;
        this.senha = senha;
        this.confirmacaoSenha = confirmacaoSenha;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmacaoSenha() {
        return confirmacaoSenha;
    }

    public void setConfirmacaoSenha(String confirmacaoSenha) {
        this.confirmacaoSenha = confirmacaoSenha;
    }
}