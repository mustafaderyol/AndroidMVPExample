package com.mustafaderyol.androidmvpexample.login;

/**
 * Created by MustafaDeryol on 19.11.2017.
 */

public interface LoginInteractor {
    interface onLoadFinishedListener {
        void onUserNameError();

        void onPasswordError();

        void onSuccess();

        void onFailure(String message);
    }

    void login(String userName, String password, onLoadFinishedListener listener);
}
