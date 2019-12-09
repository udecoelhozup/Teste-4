package com.example.cadastrousuario;

import com.example.cadastrousuario.view.Pessoa;

import org.junit.Test;

import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void getNome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        String nome = pessoa.getNome();
        assertEquals("Maria", nome);
    }

    @Test
    public void setNome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("caio");
        String nomeAlterado = pessoa.getNome();
        assertEquals("caio",nomeAlterado);

    }

    @Test
    public void getSobreNome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setSobreNome("João");
        String sobrenomeRecebido = pessoa.getSobreNome();
        assertEquals("João",sobrenomeRecebido);
    }

    @Test
    public void setSobreNome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setSobreNome("Costa");
        String sobrenomeAlterado = pessoa.getSobreNome();
        assertEquals("Costa", sobrenomeAlterado);
    }

    @Test
    public void getTelefone() {
        Pessoa pessoa = new Pessoa();
        pessoa.setTelefone("011-5555-8888");
        String recebeTelefone = pessoa.getTelefone();
        assertEquals("011-5555-8888", recebeTelefone);
    }

    @Test
    public void setTelefone() {
        Pessoa pessoa = new Pessoa();
        pessoa.setTelefone("021-4455-8899");
        String alteraTelefone = pessoa.getTelefone();
        assertEquals("021-4455-8899", alteraTelefone);

    }

    @Test
    public void getCelular() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCelular("011-8899-7867");
        String recebeCelular = pessoa.getCelular();
        assertEquals("011-8899-7867", recebeCelular);
    }

    @Test
    public void setCelular() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCelular("011-8800-6677");
        String alteraCelular = pessoa.getCelular();
        assertEquals("011-8800-6677", alteraCelular);
    }

    @Test
    public void getCpf() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("560.900.890-86");
        String recebeCpf = pessoa.getCpf();
        assertEquals("560.900.890-86", recebeCpf);
    }

    @Test
    public void setCpf() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("890.000.567-80");
        String alteraCpf = pessoa.getCpf();
        assertEquals("890.000.567-80", alteraCpf);
    }

    @Test
    public void getEscolaridade() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEscolaridade("Ensino Fundamental");
        String recebeEscolaridade = pessoa.getEscolaridade();
        assertEquals("Ensino Fundamental", recebeEscolaridade);
    }

    @Test
    public void setEscolaridade() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEscolaridade("Ensino Superior");
        String alteraEscolaridade = pessoa.getEscolaridade();
        assertEquals("Ensino Superior", alteraEscolaridade);

    }

    @Test
    public void getEndereco() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEndereco("Avenida Dos Pinheiros");
        String recebeEndereco = pessoa.getEndereco();
        assertEquals("Avenida Dos Pinheiros", recebeEndereco);

    }

    @Test
    public void setEndereco() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEndereco("Avenida Dos Palmares");
        String alteraEndereco = pessoa.getEndereco();
        assertEquals("Avenida Dos Palmares", alteraEndereco);

    }

    @Test
    public void getBairro() {
        Pessoa pessoa = new Pessoa();
        pessoa.setBairro("Vila Olimpia");
        String recebeBairro = pessoa.getBairro();
        assertEquals("Vila Olimpia", recebeBairro);

    }

    @Test
    public void setBairro() {
        Pessoa pessoa = new Pessoa();
        pessoa.setBairro("Diadema");
        String alteraBairro = pessoa.getBairro();
        assertEquals("Diadema", alteraBairro);

    }

    @Test
    public void getEstado() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstado("SP");
        String recebeEstado = pessoa.getEstado();
        assertEquals("SP", recebeEstado);

    }

    @Test
    public void setEstado() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstado("RJ");
        String alteraEstado = pessoa.getEstado();
        assertEquals("RJ", alteraEstado);

    }

    @Test
    public void getSenha() {
        Pessoa pessoa = new Pessoa();
        pessoa.setSenha("password12");
        String recebeSenha = pessoa.getSenha();
        assertEquals("password12", recebeSenha);

    }

    @Test
    public void setSenha() {
        Pessoa pessoa = new Pessoa();
        pessoa.setSenha("Password345");
        String alteraSenha = pessoa.getSenha();
        assertEquals("Password345", alteraSenha);


    }

    @Test
    public void getConfirmacaoSenha() {
        Pessoa pessoa = new Pessoa();
        pessoa.setConfirmacaoSenha("Password345");
        String recebeSenha = pessoa.getConfirmacaoSenha();
        assertEquals("Password345", recebeSenha);

    }

    @Test
    public void setConfirmacaoSenha() {
        Pessoa pessoa = new Pessoa();
        pessoa.setConfirmacaoSenha("Password000");
        String alteraSenha = pessoa.getConfirmacaoSenha();
        assertEquals("Password000", alteraSenha);

    }
}