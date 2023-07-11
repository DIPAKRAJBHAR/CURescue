package com.project.curescue.ui.about_us;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutUsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AboutUsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This app ensures the safety of women. it helps to identify and call on resources to help the one out of dangerous situations. These reduce risk and bring assistance when we are in danger the help us to send the location to the contacts . The app we designed is to provide security to women is the main purpose of this app to provide the awareness on the time of critical situation for women.\n\nThe using person can use this service by adding the emergency contacts using the emergency contacts icon in the app. When the person is emergency the user would have to shake up his/her handset, after that a distress signal(SOS) will automatically got generated from the user end and will send SMS messages to those contacts which are saved in the phone at the time of registration.\n\nThe SMS message contains that they are in danger and exact location of the victim. This app has different features and acts as a very powerful alarm that works on 24 hours to keep you safe. We will be very helpful in such situation where we have take help of this app, but if in case you come across such situation we have to press on the red button of the app will inform to our parents and friends about your location as well as a text that will make them aware that you might need some help on urgent basis, finally they can give some feedback for the app by pressing “send feedback” button.\n");
    }

    public LiveData<String> getText() {
        return mText;
    }
}