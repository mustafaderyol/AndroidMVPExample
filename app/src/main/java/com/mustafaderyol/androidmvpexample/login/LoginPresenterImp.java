package com.mustafaderyol.androidmvpexample.login;

/**
 * Created by MustafaDeryol on 19.11.2017.
 */

public class LoginPresenterImp implements LoginPresenter, LoginInteractor.onLoadFinishedListener {
    LoginView mLoginView;
    LoginInteractor mLoginInteractor;

    public LoginPresenterImp(LoginView loginView) {
        this.mLoginView = loginView;
        this.mLoginInteractor = new LoginInteractorImp();
    }

    @Override
    public void validateCred(String userName, String password) {
        if (mLoginView != null) {
            mLoginView.showProgress();
            mLoginInteractor.login(userName, password, this);
        }
    }

    @Override
    public void onDestroy() {
        if (mLoginView != null) {
            mLoginView = null;
        }
    }

    @Override
    public void onUserNameError() {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.setUserNameError();
        }
    }

    @Override
    public void onPasswordError() {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.setPasswordError();
        }
    }

    @Override
    public void onSuccess() {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.navigateToMain();
        }
    }

    @Override
    public void onFailure(String message) {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.showAlert(message);
        }
    }
}
