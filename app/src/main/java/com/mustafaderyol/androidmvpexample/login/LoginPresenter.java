package com.mustafaderyol.androidmvpexample.login;

/**
 * Created by MustafaDeryol on 19.11.2017.
 */

public interface LoginPresenter {

    void validateCred(String userName, String password);
    void onDestroy();
}
