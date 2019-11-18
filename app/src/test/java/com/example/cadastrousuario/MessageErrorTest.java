package com.example.cadastrousuario;

import org.junit.Test;

import static org.junit.Assert.*;

public class MessageErrorTest {

    @Test
    public void setLogMessageBairro() {
        MessageError msg = new MessageError();
        msg.setLogMessageBairro("O bairro está incorreto");
        String bairro = msg.getLogMessageBairro();
        assertEquals("O bairro está incorreto", bairro);
    }

    @Test
    public void setLogMessageSenha() {
        MessageError msg = new MessageError();
        msg.setLogMessageSenha("Senha incorreta");
        String senha = msg.getLogMessageSenha();
        assertEquals("Senha incorreta", senha);
    }

    @Test
    public void setLogMessageNome() {
        MessageError msg = new MessageError();
        msg.setLogMessageNome("O nome está incorreto");
        String nome = msg.getLogMessageNome();
        assertEquals("O nome está incorreto", nome);
    }

    @Test
    public void setLogMessageSobrenome() {
        MessageError msg = new MessageError();
        msg.setLogMessageSobrenome("O sobrenome informado está incorreto");
        String sobrenome = msg.getLogMessageSobrenome();
        assertEquals("O sobrenome informado está incorreto", sobrenome);
    }

    @Test
    public void setLogMessageTelefone() {
        MessageError msg = new MessageError();
        msg.setLogMessageTelefone("O telefone: 5891-0000 está incorreto");
        String telefone = msg.getLogMessageTelefone();
        assertEquals("O telefone: 5891-0000 está incorreto", telefone);
    }

    @Test
    public void setLogMessageCelular() {
        MessageError msg = new MessageError();
        msg.setLogMessageCelular("O celular fornecido está incorreto");
        String celular = msg.getLogMessageCelular();
        assertEquals("O celular fornecido está incorreto", celular);
    }

    @Test
    public void setLogMessageCpf() {
        MessageError msg = new MessageError();
        msg.setLogMessageCpf("o CPF inserido está incorreto");
        String cpf = msg.getLogMessageCpf();
        assertEquals("o CPF inserido está incorreto", cpf);
    }

    @Test
    public void setLogMessageCpfInvalid() {
        MessageError msg = new MessageError();
        msg.setLogMessageCpf("forneça um CPF válido");
        String cpf = msg.getLogMessageCpf();
        assertEquals("forneça um CPF válido", cpf);

    }

    @Test
    public void setLogMessageEndereco() {
        MessageError msg = new MessageError();
        msg.setLogMessageEndereco("O endereço fornecido não existe");
        String endereco = msg.getLogMessageEndereco();
        assertEquals("O endereço fornecido não existe", endereco);
    }

    @Test
    public void getLogMessageNome() {
        MessageError msg = new MessageError();
        String nome = "MariaDD";
        msg.setLogMessageNome(nome);
        assertEquals("MariaDD", msg.getLogMessageNome());
    }

    @Test
    public void getLogMessageSobrenome() {
        MessageError msg = new MessageError();
        String sobrenome = "Carminelli";
        msg.setLogMessageSobrenome(sobrenome);
        assertEquals("Carminelli", msg.getLogMessageSobrenome());
    }

    @Test
    public void getLogMessageTelefone() {
        MessageError msg = new MessageError();
        String telefone = "011-5566-5566";
        msg.setLogMessageTelefone(telefone);
        assertEquals("011-5566-5566", msg.getLogMessageTelefone());
      }

    @Test
    public void getLogMessageCelular() {
        MessageError msg = new MessageError();
        String celular = "011-91111-0000";
        msg.setLogMessageCelular(celular);
        assertEquals("011-91111-0000", msg.getLogMessageCelular());
       }

    @Test
    public void getLogMessageCpf() {
        MessageError msg = new MessageError();
        String cpf = "123.456.789-10";
        msg.setLogMessageCpf(cpf);
        assertEquals("123.456.789-10", msg.getLogMessageCpf());
    }

    @Test
    public void getLogMessageCpfInvalid() {
        MessageError msg = new MessageError();
        String cpf = "123.456.789";
        msg.setLogMessageCpf(cpf);
        assertEquals("123.456.789", msg.getLogMessageCpf());
    }

    @Test
    public void getLogMessageEndereco() {
        MessageError msg = new MessageError();
        String endereco = "Avenida Brasil";
        msg.setLogMessageEndereco(endereco);
        assertEquals("Avenida Brasil", msg.getLogMessageEndereco());
    }

    @Test
    public void getLogMessageBairro() {
        MessageError msg = new MessageError();
        String bairro = "Brasilandia";
        msg.setLogMessageBairro(bairro);
        assertEquals("Brasilandia", msg.getLogMessageBairro());
    }

    @Test
    public void getLogMessageSenha() {
        MessageError msg = new MessageError();
        String senha = "@#%wwWt%";
        msg.setLogMessageSenha(senha);
        assertEquals("@#%wwWt%", msg.getLogMessageSenha());
    }
}