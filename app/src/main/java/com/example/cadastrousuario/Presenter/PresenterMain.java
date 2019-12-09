package com.example.cadastrousuario.Presenter;

import com.example.cadastrousuario.contract.ContractMain;

public class PresenterMain implements ContractMain.Presenter {
    private ContractMain.view view;

    public PresenterMain(ContractMain.view view) {
        this.view = view;
    }

    @Override
    public void onStart() {
        view.setData();
        view.setSpinnerState();
        view.setSpinnerUniversity();
        view.setMask();
        view.msg();
    }

    @Override
    public void onButtonClickedSend() {
        view.sendData();
        view.validarCampos();
        view.navigateOnNextScreen();
    }

    @Override
    public void onButtonClickedClear() {
        view.clearAllFields();
    }

    @Override
    public void onButtonClickedFinish() {
        view.msg();
        view.showDialogMessage();
    }
}
