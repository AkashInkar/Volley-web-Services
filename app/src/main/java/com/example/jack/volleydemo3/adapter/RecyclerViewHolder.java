package com.example.jack.volleydemo3.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.jack.volleydemo3.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView name,realname,team,publisher;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
        realname = itemView.findViewById(R.id.realname);
        team =itemView.findViewById(R.id.team);
        publisher = itemView.findViewById(R.id.publisher);
    }
}
