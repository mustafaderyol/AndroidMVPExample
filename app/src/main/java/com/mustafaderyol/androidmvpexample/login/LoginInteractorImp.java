package com.mustafaderyol.androidmvpexample.login;

import android.text.TextUtils;

import android.os.Handler;

/**
 * Created by MustafaDeryol on 19.11.2017.
 */

public class LoginInteractorImp implements LoginInteractor {
    @Override
    public void login(String userName, String password, final onLoadFinishedListener listener) {
        if (TextUtils.isEmpty(userName)) {
            listener.onUserNameError();
        } else if (TextUtils.isEmpty(password)) {
            listener.onPasswordError();
        } else if ("admin".equals(userName) && "admin".equals(password)) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    listener.onSuccess();
                }
            }, 3000);
        } else {
            listener.onFailure("Invalid Credentials");
        }
    }
}
