package com.mobileapps.week3daily3homework_fragmentsrecyclerview;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.mobileapps.week3daily3homework_fragmentsrecyclerview.Fragments.InputFragment;

public class MainActivity extends AppCompatActivity implements InputFragment.OnFragmentInteractionListener {

    EditText etFirstName;
    EditText etLastName;
     EditText etPhoneNumber;
     EditText etEmailAddress;

     FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstName=findViewById(R.id.etFirstName);
        etLastName=findViewById(R.id.etLastName);
        etPhoneNumber=findViewById(R.id.etPhoneNumber);
        etEmailAddress=findViewById(R.id.etEmailAddress);
        fm=getSupportFragmentManager();

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


    public void CLICK(View view) {
    }
}
