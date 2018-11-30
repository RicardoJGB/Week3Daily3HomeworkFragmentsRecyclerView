package com.mobileapps.week3daily3homework_fragmentsrecyclerview.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.mobileapps.week3daily3homework_fragmentsrecyclerview.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InputFragment extends Fragment implements View.OnClickListener{

    public static final String SEND_TAG= "sending data fragment";

    EditText etFirstName;
    Button btnSend;
    OnFragmentInteractionListener someListener;

    public static InputFragment newInstance() {
        InputFragment fragment = new InputFragment();
        return fragment;

    }

    public InputFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_input, container, false);
        etFirstName= view.findViewById(R.id.etFirstName);
        btnSend= getView().findViewById(R.id.btnSend);
        btnSend.setOnClickListener(this);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View view) {
        String userInputFirstName = etFirstName.getText().toString();
        someListener.sendMessageToMain(userInputFirstName.isEmpty() ? "EMPTY": userInputFirstName);

    }

    public interface OnFragmentInteractionListener {
        void sendMessageToMain(String userInputFirstName);
    }
}
