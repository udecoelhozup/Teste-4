package com.example.cadastrousuario;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DadosUsuario extends AppCompatActivity {

    Button button;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_usuario);

        floatingActionButton = findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Deseja concluir o cadastro?", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Finalizar", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);

                            }
                        }).show();
            }
        });
        Pessoa pessoa = new Pessoa();

        TextView textNome = (TextView) findViewById(R.id.recebeNome);
        TextView textSobrenome = (TextView) findViewById(R.id.recebeSobrenome);
        TextView textTelefone = (TextView) findViewById(R.id.recebeTelefone);
        TextView textCelular = (TextView) findViewById(R.id.recebeCelular);
        TextView textCpf = (TextView) findViewById(R.id.recebeCpf);
        TextView textRg = (TextView) findViewById(R.id.recebeRg);
        TextView textEscolaridade = (TextView) findViewById(R.id.recebeEscolaridade);
        TextView textEndereco = (TextView) findViewById(R.id.recebeEndereco);
        TextView textBairro = (TextView) findViewById(R.id.recebeBairro);
        TextView textEstado = (TextView) findViewById(R.id.recebeEstado);

        Bundle dados = getIntent().getExtras();

        pessoa = (Pessoa) dados.getSerializable("objeto");

        textNome.setText("Nome: " + pessoa.getNome());

        textSobrenome.setText("Sobrenome: " + pessoa.getSobreNome());

        textTelefone.setText("Telefone: " + pessoa.getTelefone());

        textCelular.setText("Celular: " + pessoa.getCelular());

        textCpf.setText("CPF: " + pessoa.getCpf());

        textRg.setText("RG: " + pessoa.getRg());

        textEscolaridade.setText("Escolaridade: " + pessoa.getEscolaridade().toString());

        textEndereco.setText("Endereço: " + pessoa.getEndereco().toString());

        textBairro.setText("Bairro: " + pessoa.getBairro().toString());

        textEstado.setText("Estado: " + pessoa.getEstado());


    }

    public void backPage(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}



