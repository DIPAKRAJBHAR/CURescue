package com.project.curescue.ui.helpline;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HelplineViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HelplineViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Helpline Options ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}