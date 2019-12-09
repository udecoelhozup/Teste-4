package com.example.cadastrousuario.Presenter;

import com.example.cadastrousuario.contract.ContractDadosUsuario;

public class PresenterDadosUsuario implements ContractDadosUsuario.Presenter {
    private ContractDadosUsuario.view view;

    public PresenterDadosUsuario(ContractDadosUsuario.view view) {
        this.view = view;
    }

    @Override
    public void onStart() {
        view.setData();
        view.sendData();
    }

    @Override
    public void onButtonClickedSend() {
        view.navigateOnNextScreen();
    }


}
