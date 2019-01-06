package com.example.jack.volleydemo3.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jack.volleydemo3.R;
import com.example.jack.volleydemo3.model.Model;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    ArrayList<Model> arrayList = new ArrayList<>();

    public RecyclerAdapter(ArrayList<Model> arrayList)
    {
       this.arrayList = arrayList;

    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);

        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.name.setText(arrayList.get(position).getName());
        holder.realname.setText(arrayList.get(position).getRealname());
        holder.team.setText(arrayList.get(position).getTeam());
        holder.publisher.setText(arrayList.get(position).getCreatedby());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
