package com.mobileapps.week3daily3homework_fragmentsrecyclerview;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.mobileapps.week3daily3homework_fragmentsrecyclerview.Fragments.DisplayFragment;
import com.mobileapps.week3daily3homework_fragmentsrecyclerview.Fragments.InputFragment;

public class MainActivity extends AppCompatActivity implements InputFragment.OnFragmentInteractionListener {

    EditText etFirstName;
    EditText etLastName;
     EditText etPhoneNumber;
     EditText etEmailAddress;
     DisplayFragment displayFragment;
     FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayFragment=DisplayFragment.newInstance();
        fm=getSupportFragmentManager();
        fm.beginTransaction().add(R.id.sendingFrag,InputFragment.newInstance(),InputFragment.SEND_TAG)
                .addToBackStack(InputFragment.SEND_TAG).commit();
        fm.beginTransaction().add(R.id.receivingFrag,displayFragment,DisplayFragment.RCV_TAG)
                .addToBackStack(DisplayFragment.RCV_TAG).commit();

    }

    public void sendMessageToMain (String messageToSend){
        displayFragment.receiveData(messageToSend);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



}
