package com.mobileapps.week3daily3homework_fragmentsrecyclerview.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mobileapps.week3daily3homework_fragmentsrecyclerview.Adapter;
import com.mobileapps.week3daily3homework_fragmentsrecyclerview.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {
    public static final String RCV_TAG="receiving data";
    TextView tvUserInput;
    RecyclerView rvDataReceived;
    Adapter adapter;

    ArrayList<String> receivedDataList=new ArrayList<>();

    public static DisplayFragment newInstance(){
        DisplayFragment displayFragment = new DisplayFragment();
        return displayFragment;
    }


    public DisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display,container,false);
        receivedDataList.add("MESSAGE");
        rvDataReceived=view.findViewById(R.id.rvDataReceived);
        adapter=new Adapter(receivedDataList,this.getContext());
        rvDataReceived.setLayoutManager(new LinearLayoutManager(this.getContext()));
        rvDataReceived.setAdapter(adapter);
        return view;
    }

    public void receiveData (String msgReceived){
        adapter.getNewInput(msgReceived);
    }

}
