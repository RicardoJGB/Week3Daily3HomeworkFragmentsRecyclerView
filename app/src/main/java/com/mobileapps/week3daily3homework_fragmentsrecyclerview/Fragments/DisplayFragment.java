package com.mobileapps.week3daily3homework_fragmentsrecyclerview.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mobileapps.week3daily3homework_fragmentsrecyclerview.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {
    public static final String RCV_TAG="receiving data";
    TextView tvUserInput;
    RecyclerView rvDataReceived;
    


    public DisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display, container, false);
    }

}
