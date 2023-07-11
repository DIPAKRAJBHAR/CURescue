package com.project.curescue.ui.notificaton;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationServiceViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NotificationServiceViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("Notification will be sent to the registered number");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
