package com.example.cadastrousuario.validations;

import android.widget.EditText;

import com.example.cadastrousuario.view.Pessoa;

public class ValidationData {

    public static boolean validateForm(EditText editText) {
        String formIndex = editText.getText().toString();
        boolean valid = true;
        if (formIndex.length() <= 0) {
            valid = false;
        } else {
            valid = true;
        }
        return valid;
    }
    public static boolean validatePassword(EditText editText) {
        Pessoa pessoa = new Pessoa();
        String password = editText.getText().toString();
        pessoa.setSenha(password.toString());
        boolean valid = true;
        if (pessoa.getSenha().length() < 0 || pessoa.getSenha() == null || pessoa.getSenha() == "") {
            valid = false;
        } else {
            valid = true;
        }
        return valid;
    }
    public static boolean confirmPassword(EditText editText) {
        Pessoa pessoa = new Pessoa();
        String peopleConfirm = editText.getText().toString();
        boolean valid = true;
        if (pessoa.getSenha() != peopleConfirm) {
            valid = false;
        }
        return valid;
    }

}
