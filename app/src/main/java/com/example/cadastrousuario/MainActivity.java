package com.example.cadastrousuario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.SimpleMaskTextWatcher;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner edtEscolaridade;
    Spinner edtEstado;
    Button limparDados;
    EditText edtNome;
    EditText edtSobrenome;
    EditText edtTelefone;
    EditText edtCelular;
    EditText edtCpf;
    EditText edtRg;
    EditText edtEndereco;
    EditText edtBairro;
    EditText edtSenha;
    EditText edtConfirmaSenha;
    ImageButton extProgram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Pessoa pessoa = new Pessoa();
        edtEscolaridade = (Spinner) findViewById(R.id.spinnerEscolaridade);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Escolaridades, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        edtEscolaridade.setAdapter(adapter);

        edtEstado = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.Estados, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        edtEstado.setAdapter(adapter1);

        limparDados();

        extProgram = (ImageButton) findViewById(R.id.modalSair);
        extProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();

            }

        });

    }

    public void openDialog() {
        Dialog dialog = new Dialog();
        dialog.show(getSupportFragmentManager(), "Mensagem de Erro");
    }


    public MessageError msg() {
        MessageError msg = new MessageError();

        msg.setLogMessageNome("O campo Nome é obrigatório");
        msg.setLogMessageSobrenome("O campo Sobrenome é obrigatório");
        msg.setLogMessageTelefone("O campo Telefone é obrigatório");
        msg.setLogMessageCelular("O campo Celular é obrigatório");
        msg.setLogMessageCpf("O campo CPF é obrigatório");
        msg.setLogMessageRg("O campo RG é obrigatório");
        msg.setLogMessageEndereco("O campo Endereço é obrigatório");
        msg.setLogMessageBairro("O campo Bairro é obrigatório");
        msg.setLogMessageSenha("As senhas não conferem");

        return msg;
    }

    public void insereDados() {

        edtNome = (EditText) findViewById(R.id.nome);
        edtSobrenome = (EditText) findViewById(R.id.sobreNome);
        edtTelefone = (EditText) findViewById(R.id.telefone);
        edtCelular = (EditText) findViewById(R.id.celular);
        edtCpf = (EditText) findViewById(R.id.cpf);
        edtRg = (EditText) findViewById(R.id.rg);
        edtEscolaridade = (Spinner) findViewById(R.id.spinnerEscolaridade);
        edtEndereco = (EditText) findViewById(R.id.endereco);
        edtBairro = (EditText) findViewById(R.id.bairro);
        edtEstado = (Spinner) findViewById(R.id.spinner2);
        edtSenha = (EditText) findViewById(R.id.senha);
        edtConfirmaSenha = (EditText) findViewById(R.id.corfimaSenha);
        extProgram = (ImageButton) findViewById(R.id.modalSair);

        SimpleMaskFormatter smfCell = new SimpleMaskFormatter("(NN)NNNNN-NNNN");
        SimpleMaskTextWatcher smtfCell = new SimpleMaskTextWatcher(edtCelular, smfCell);
        edtCelular.addTextChangedListener(smtfCell);

        SimpleMaskFormatter smfPhone = new SimpleMaskFormatter("(NN)NNNN-NNNN");
        SimpleMaskTextWatcher smtfPhone = new SimpleMaskTextWatcher(edtTelefone, smfPhone);
        edtTelefone.addTextChangedListener(smtfPhone);

        SimpleMaskFormatter smfRG = new SimpleMaskFormatter("NN.NNN.NNN-N");
        SimpleMaskTextWatcher smtfRG = new SimpleMaskTextWatcher(edtRg, smfRG);
        edtRg.addTextChangedListener(smtfRG);

        SimpleMaskFormatter smfCPF = new SimpleMaskFormatter("NNN.NNN.NNN-NN");
        SimpleMaskTextWatcher smtfCPF = new SimpleMaskTextWatcher(edtCpf, smfCPF);
        edtCpf.addTextChangedListener(smtfCPF);
    }

    public boolean validarCampos() {
        Pessoa pessoa = new Pessoa();
        MessageError log = msg();
        boolean validator = true;
        insereDados();

        String nome = edtNome.getText().toString();
        String sobreNome = edtSobrenome.getText().toString();
        String telefone = edtTelefone.getText().toString();
        String celular = edtCelular.getText().toString();
        String cpf = edtCpf.getText().toString();
        String rg = edtRg.getText().toString();
        String escolaridade = edtEscolaridade.getSelectedItem().toString();
        String endereco = edtEndereco.getText().toString();
        String bairro = edtBairro.getText().toString();
        String estado = edtEstado.getSelectedItem().toString();
        String senha = edtSenha.getText().toString();
        String confirmaSenha = edtConfirmaSenha.getText().toString();
        pessoa.setSenha(edtSenha.getText().toString());
        pessoa.setConfirmacaoSenha(edtConfirmaSenha.getText().toString());

        if (nome.length() == 0 || nome == null) {
            Toast.makeText(getApplicationContext(), log.getLogMessageNome(), Toast.LENGTH_SHORT).show();
            validator = false;
        } else if (sobreNome.length() == 0 || sobreNome == null) {
            Toast.makeText(getApplicationContext(), log.getLogMessageSobrenome(), Toast.LENGTH_SHORT).show();
            validator = false;
        } else if (telefone.length() == 0 || telefone == null) {
            Toast.makeText(getApplicationContext(), log.getLogMessageTelefone(), Toast.LENGTH_SHORT).show();
            validator = false;
        } else if (celular.length() == 0 || celular == null) {
            Toast.makeText(getApplicationContext(), log.getLogMessageCelular(), Toast.LENGTH_SHORT).show();
            validator = false;
        } else if (cpf.length() == 0) {
            Toast.makeText(getApplicationContext(), log.getLogMessageCpf(), Toast.LENGTH_SHORT).show();
            validator = false;
        } else if (rg.length() == 0) {
            Toast.makeText(getApplicationContext(), log.getLogMessageRg(), Toast.LENGTH_SHORT).show();
            validator = false;
        } else if (endereco.length() == 0 || endereco == null) {
            Toast.makeText(getApplicationContext(), log.getLogMessageEndereco(), Toast.LENGTH_SHORT).show();
            validator = false;
        } else if (bairro.length() == 0 || bairro == null) {
            Toast.makeText(getApplicationContext(), log.getLogMessageBairro(), Toast.LENGTH_SHORT).show();
            validator = false;
        } else if (pessoa.getSenha().equals(pessoa.getConfirmacaoSenha()) && pessoa.getSenha().length() != 0 && pessoa.getConfirmacaoSenha().length() != 0 &&
                pessoa.getSenha() != null && pessoa.getConfirmacaoSenha() != null) {
            validator = true;
        } else if (!pessoa.getSenha().equals(pessoa.getConfirmacaoSenha()) || pessoa.getSenha().length() == 0 || pessoa.getSenha().isEmpty() ||
                pessoa.getSenha() == null || pessoa.getConfirmacaoSenha().length() == 0 || pessoa.getConfirmacaoSenha().isEmpty() ||
                pessoa.getConfirmacaoSenha() == null) {
            validator = false;
            Toast.makeText(getApplicationContext(), log.getLogMessageSenha(), Toast.LENGTH_SHORT).show();
        }

        return validator;
    }

    public void limparDados() {
        insereDados();
        limparDados = (Button) findViewById(R.id.reset);
        limparDados.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                edtNome.getText().clear();
                edtSobrenome.getText().clear();
                edtTelefone.getText().clear();
                edtCelular.getText().clear();
                edtCpf.getText().clear();
                edtRg.getText().clear();
                edtEscolaridade.setSelection(0);
                edtEndereco.getText().clear();
                edtBairro.getText().clear();
                edtEstado.setSelection(0);
                edtSenha.getText().clear();
                edtConfirmaSenha.getText().clear();
            }
        });
    }

    public void enviarDados(View view) {

        boolean validator = validarCampos();
        Intent intent = new Intent(this, DadosUsuario.class);
        Pessoa pessoa = registerUser();
        intent.putExtra("objeto", pessoa);

        if (validator) {
            startActivity(intent);
        } else {
            registerUser();
        }


    }

    public Pessoa registerUser() {

        Pessoa pessoa = new Pessoa();
        insereDados();

        pessoa.setNome(edtNome.getText().toString());

        pessoa.setSobreNome(edtSobrenome.getText().toString());

        pessoa.setTelefone(edtTelefone.getText().toString());

        pessoa.setCelular(edtCelular.getText().toString());

        pessoa.setCpf(edtCpf.getText().toString());

        pessoa.setRg(edtRg.getText().toString());

        pessoa.setEscolaridade(edtEscolaridade.getSelectedItem().toString());

        pessoa.setEndereco(edtEndereco.getText().toString());

        pessoa.setBairro(edtBairro.getText().toString());

        pessoa.setEstado(edtEstado.getSelectedItem().toString());

        return pessoa;

    }

}
