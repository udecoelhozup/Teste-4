package com.example.cadastrousuario.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.cadastrousuario.Presenter.PresenterMain;
import com.example.cadastrousuario.R;
import com.example.cadastrousuario.contract.ContractMain;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.SimpleMaskTextWatcher;

public class MainActivity extends AppCompatActivity  implements ContractMain.view {
    Spinner edtEscolaridade, edtEstado;
    Button limparDados, sendData;
    EditText edtNome, edtSobrenome, edtTelefone, edtCelular, edtCpf, edtRg, edtEndereco, edtBairro, edtSenha, edtConfirmaSenha;
    ImageButton extProgram;
    private ContractMain.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterMain(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onStart();
    }

    public void setSpinnerUniversity() {
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Escolaridades, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        edtEscolaridade.setAdapter(adapter);
    }
    public void setSpinnerState() {
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.Estados, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        edtEstado.setAdapter(adapter1);
    }

    public MessageError logMessages() {
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

    public void setData() {
        extProgram = (ImageButton) findViewById(R.id.modalSair);
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
        edtEscolaridade = (Spinner) findViewById(R.id.spinnerEscolaridade);
        edtEstado = (Spinner) findViewById(R.id.spinner2);
        limparDados = (Button) findViewById(R.id.reset);
        sendData = (Button) findViewById(R.id.sendData);

        extProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonClickedFinish();
            }
        });

        sendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonClickedSend();
            }
        });

        limparDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonClickedClear();
            }
        });
    }
    public void sendData(){
        sendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonClickedSend();
            }
        });
    }
    public void setMask() {
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
        MessageError log = logMessages();
        boolean validator = true;

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
/*

    public void limparDados() {
        limparDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonClickedClear();
            }
        });
    }
*/

    public Pessoa registerUser() {
        Pessoa pessoa = new Pessoa();
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

    @Override
    public void navigateOnNextScreen() {
        boolean validator = validarCampos();
        Intent intent = new Intent(getApplicationContext(), DadosUsuario.class);
        Pessoa pessoa = registerUser();
        intent.putExtra("objeto", pessoa);
        if (validator) {
            startActivity(intent);
        } else {
            registerUser();
        }
    }

    @Override
    public void clearAllFields() {
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

    @Override
    public void showDialogMessage() {
        extProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog();
                dialog.show(getSupportFragmentManager(), "Mensagem de Erro");
            }
        });
    }



    @Override
    public MessageError msg() {
        return null;
    }
}
