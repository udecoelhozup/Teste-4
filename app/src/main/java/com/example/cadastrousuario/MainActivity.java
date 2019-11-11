package com.example.cadastrousuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

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
    EditText edtEndereco;
    EditText edtBairro;
    EditText edtSenha;
    EditText edtConfirmaSenha;
    Boolean validate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Pessoa pessoa = new Pessoa();


        edtEscolaridade = (Spinner) findViewById(R.id.spinnerEscolaridade);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.Escolaridades, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        edtEscolaridade.setAdapter(adapter);

        edtEstado = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.Estados, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        edtEstado.setAdapter(adapter1);

        limparDados();


    }

    public void limparDados(){
        limparDados = (Button) findViewById(R.id.reset);
        limparDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtNome = (EditText) findViewById(R.id.nome);
                edtSobrenome = (EditText) findViewById(R.id.sobreNome);
                edtTelefone = (EditText) findViewById(R.id.telefone);
                edtCelular = (EditText) findViewById(R.id.celular);
                edtCpf = (EditText) findViewById(R.id.cpf);
                edtEscolaridade = (Spinner) findViewById(R.id.spinnerEscolaridade);
                edtEndereco = (EditText) findViewById(R.id.endereco);
                edtBairro = (EditText) findViewById(R.id.bairro);
                edtEstado = (Spinner) findViewById(R.id.spinner2);
                edtSenha = (EditText) findViewById(R.id.senha);
                edtConfirmaSenha = (EditText) findViewById(R.id.corfimaSenha);

                edtNome.getText().clear();
                edtSobrenome.getText().clear();
                edtTelefone.getText().clear();
                edtCelular.getText().clear();
                edtCpf.getText().clear();
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


        Intent intent = new Intent(this, DadosUsuario.class);
        Pessoa pessoa = registerUser();
        //intent.putExtra("objeto",spinnerEscolaridade.getSelectedItem().toString());
        intent.putExtra("objeto", pessoa);
        startActivity(intent);

    }



    public Pessoa registerUser() {
        Pessoa pessoa = new Pessoa();

        EditText edtNome = (EditText) findViewById(R.id.nome);
        pessoa.setNome(edtNome.getText().toString());


        EditText edtSobrenome = (EditText) findViewById(R.id.sobreNome);
        pessoa.setSobreNome(edtSobrenome.getText().toString());

        EditText edtTelefone = (EditText) findViewById(R.id.telefone);
        pessoa.setTelefone(edtTelefone.getText().toString());


        EditText edtCelular = (EditText) findViewById(R.id.celular);
        pessoa.setCelular(edtCelular.getText().toString());

        EditText edtCpf = (EditText) findViewById(R.id.cpf);
        pessoa.setCpf(edtCpf.getText().toString());

        Spinner edtEscolaridade = (Spinner) findViewById(R.id.spinnerEscolaridade);
        pessoa.setEscolaridade(edtEscolaridade.getSelectedItem().toString());

        EditText edtEndereco = (EditText) findViewById(R.id.endereco);
        pessoa.setEndereco(edtEndereco.getText().toString());

        EditText edtBairro = (EditText) findViewById(R.id.bairro);
        pessoa.setBairro(edtBairro.getText().toString());

        Spinner edtEstado = (Spinner) findViewById(R.id.spinner2);
        pessoa.setEstado(edtEstado.getSelectedItem().toString());

        return pessoa;

    }

}
