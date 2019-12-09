package com.example.cadastrousuario.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cadastrousuario.Presenter.PresenterDadosUsuario;
import com.example.cadastrousuario.R;
import com.example.cadastrousuario.contract.ContractDadosUsuario;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DadosUsuario extends AppCompatActivity implements ContractDadosUsuario.view {

    private FloatingActionButton floatingActionButton;
    private ContractDadosUsuario.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_usuario);
        presenter = new PresenterDadosUsuario(this);
    }

    public void backPage(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onStart();
    }

    public void setData() {
        TextView textNome = findViewById(R.id.recebeNome);
        TextView textSobrenome = findViewById(R.id.recebeSobrenome);
        TextView textTelefone = findViewById(R.id.recebeTelefone);
        TextView textCelular = findViewById(R.id.recebeCelular);
        TextView textCpf = findViewById(R.id.recebeCpf);
        TextView textRg = findViewById(R.id.recebeRg);
        TextView textEscolaridade = findViewById(R.id.recebeEscolaridade);
        TextView textEndereco = findViewById(R.id.recebeEndereco);
        TextView textBairro = findViewById(R.id.recebeBairro);
        TextView textEstado = findViewById(R.id.recebeEstado);
        floatingActionButton = findViewById(R.id.floatingActionButton);

        Pessoa pessoa = new Pessoa();
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

    public void sendData() {
        floatingActionButton = findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Deseja concluir o cadastro?", Snackbar.LENGTH_SHORT)
                        .setAction("Finalizar", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                presenter.onButtonClickedSend();
                            }
                }).show();
            }
        });
    }

    public void navigateOnNextScreen() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


}







