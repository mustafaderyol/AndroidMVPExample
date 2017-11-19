package com.mustafaderyol.androidmvpexample.login;

/**
 * Created by MustafaDeryol on 19.11.2017.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUserNameError();

    void setPasswordError();

    void navigateToMain();

    void showAlert(String message);
}
