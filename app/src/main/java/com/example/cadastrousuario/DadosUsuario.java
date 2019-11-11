package com.example.cadastrousuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DadosUsuario extends AppCompatActivity {


 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_usuario);



        Pessoa pessoa = new Pessoa();

        TextView textNome = (TextView) findViewById(R.id.recebeNome);
        TextView textSobrenome = (TextView) findViewById(R.id.recebeSobrenome);
        TextView textTelefone = (TextView) findViewById(R.id.recebeTelefone);
        TextView textCelular = (TextView) findViewById(R.id.recebeCelular);
        TextView textCpf = (TextView) findViewById(R.id.recebeCpf);
        TextView textEscolaridade = (TextView) findViewById(R.id.recebeEscolaridade);
        TextView textEndereco = (TextView) findViewById(R.id.recebeEndereco);
        TextView textBairro = (TextView) findViewById(R.id.recebeBairro);
        TextView textEstado = (TextView) findViewById(R.id.recebeEstado);

        Bundle dados = getIntent().getExtras();

        pessoa = (Pessoa) dados.getSerializable("objeto");

        textNome.setText("Nome: " + pessoa.getNome());

        textSobrenome.setText("Sobrenome: " + pessoa.getSobreNome());

        textTelefone.setText("Telefone: "+pessoa.getTelefone());

        textCelular.setText("Celular: "+pessoa.getCelular());

        textCpf.setText("CPF: "+pessoa.getCpf());

        textEscolaridade.setText("Escolaridade: "+pessoa.getEscolaridade().toString());

        textEndereco.setText("Endereço: "+pessoa.getEndereco().toString());

        textBairro.setText("Bairro: "+pessoa.getBairro().toString());

        textEstado.setText("Estado: "+pessoa.getEstado());

    }

    public void success(View view){
     Pessoa pessoa = new Pessoa("","","","","","","","","","","");
     Intent intent = new Intent(this, MainActivity.class);
     startActivity(intent);
     String message = "Cadastro concluído com Sucesso!";
     Toast.makeText(this,message,Toast.LENGTH_LONG).show();

    }


}
