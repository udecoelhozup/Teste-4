package com.example.cadastrousuario.contract;

import com.example.cadastrousuario.view.MessageError;
import com.example.cadastrousuario.view.Pessoa;

public interface ContractMain {

    interface view{
    void setData();
    void setSpinnerUniversity();
    void setSpinnerState();
    void setMask();
    boolean validarCampos();
    void navigateOnNextScreen();
    void clearAllFields();
    void showDialogMessage();
    void sendData();
    MessageError msg();
    }

    interface Presenter{
    void onStart();
    void onButtonClickedSend();
    void onButtonClickedClear();
    void onButtonClickedFinish();
    }
}
