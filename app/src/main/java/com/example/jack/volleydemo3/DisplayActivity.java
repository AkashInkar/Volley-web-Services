package com.example.jack.volleydemo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jack.volleydemo3.adapter.RecyclerAdapter;
import com.example.jack.volleydemo3.model.Model;
import com.example.jack.volleydemo3.service.BackgroundTask;

import java.util.ArrayList;

public class DisplayActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Model> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        recyclerView =findViewById(R.id.recyclerview);
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        BackgroundTask backgroundTask = new BackgroundTask(DisplayActivity.this);
        arrayList =backgroundTask.getList();
        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);

    }
}
