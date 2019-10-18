package com.maqpoon.codesnipit.VIewModels;

public class FormPresenterImpl implements FormPresenter, FormInteractor.OnFinishedListener {

    private FormView formView;
    private FormInteractor getformInteractor;
    public FormPresenterImpl(FormView formView, FormInteractor getformInteractor) {
        this.formView = formView;
        this.getformInteractor = getformInteractor;
    }
    @Override
    public void onButtonClick() {
        if (formView != null) {
            formView.showProgress();
        }

        getformInteractor.getNextUser(this);
    }

    @Override
    public void onDestroy() {
        formView = null;
    }

    @Override
    public void onFinished(User user) {
        if (formView != null) {
            formView.setUser(user);
            formView.hideProgress();
        }
    }
}
