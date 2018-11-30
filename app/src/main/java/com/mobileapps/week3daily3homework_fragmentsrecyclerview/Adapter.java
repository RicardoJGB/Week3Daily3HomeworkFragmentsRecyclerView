package com.mobileapps.week3daily3homework_fragmentsrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList<String> receivedList = new ArrayList<>();
    Context context;

    public Adapter (ArrayList<String> receivedList, Context context){
        this.receivedList=receivedList;
        this.context=context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.data_received_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, int i) {
        viewHolder.tvItemData.setText(receivedList.get(i));

    }

    @Override
    public int getItemCount() {
        return receivedList.size();
    }

    public void getNewInput(String nextInput){
        receivedList.add(nextInput);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvItemData;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItemData=itemView.findViewById(R.id.tvReceivedData);
        }
    }
}
