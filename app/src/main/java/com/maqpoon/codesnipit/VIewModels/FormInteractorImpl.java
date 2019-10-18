package com.maqpoon.codesnipit.VIewModels;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FormInteractorImpl implements FormInteractor {

    private List<User> arrayList = Arrays.asList(
            new User("hussain_km@hotmail.com","03133106243","4120488632361","rwp","@123"),
            new User("husssain.km@gmail.com","03133106241","4120488632361","bwp","12312"),
            new User("maqpoon12@gmail.com","03133106223","4120488632361","glt","123123522313"),
            new User("maqpoon.gb@gmail.com","03133106222","4120488632361","karc","46321231"),
            new User("maqs.gb@gmail.com","03133106222","4120488632361","hyd","09876543"),
            new User("maqpoon.codersranch@gmail.com","03133106111","4120488632361","isl","ashgfx"),
            new User("maqpoon.gbtech@gmail.com","03133106532","4120488632361","lhr","dfsdfsdf"),
            new User("sagi2k4@yahoo.com","0231122323","4120488632361","ny","wererwer"));
    @Override
    public void getNextUser(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(getRandomString());
            }
        }, 1200);
    }
    private User getRandomString() {

        Random random = new Random();
        int index = random.nextInt(arrayList.size());

        return arrayList.get(index);
    }
}
