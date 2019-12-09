package com.example.cadastrousuario.contract;

public interface ContractDadosUsuario {

    interface view{
        void setData();
        void navigateOnNextScreen();
        void sendData();
    }
    interface Presenter{
        void onStart();
        void onButtonClickedSend();
    }
}
