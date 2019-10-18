package com.maqpoon.codesnipit.VIewModels;

public interface FormInteractor {
    interface OnFinishedListener {
        void onFinished(User user);
    }
    void getNextUser(OnFinishedListener listener);
}
