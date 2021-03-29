package com.example.employeelogin;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private RecyclerView recycleview;
    private List<ListPojo> list;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recycleview = findViewById(R.id.recycleview);
        list = new ArrayList<>();

        Sync sync = Sync.getSyncInstance();
        list.addAll(sync.getSampleList());

        LinearLayoutManager layoutManager = new LinearLayoutManager(ListActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycleview.setLayoutManager(layoutManager);

        adapter = new ListAdapter(ListActivity.this,list);
        recycleview.setAdapter(adapter);



    }
}