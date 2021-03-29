package com.example.employeelogin;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    private EditText name;
    private EditText age;
    private EditText cname;
    private Button btn_submit;
    private ArrayList<ListPojo> list;
    ListPojo listPojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        cname = findViewById(R.id.cname);
        btn_submit = findViewById(R.id.btn_submit);

        list = new ArrayList<>();

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkValid();
            }
        });



    }

    private void checkValid() {
        if(name.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(DetailActivity.this,"Please enter name",Toast.LENGTH_SHORT).show();
        }else   if(age.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(DetailActivity.this,"Please enter age",Toast.LENGTH_SHORT).show();
        }else   if(cname.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(DetailActivity.this,"Please enter company name",Toast.LENGTH_SHORT).show();
        }else{
            save();
        }
    }

    private void save() {

        listPojo = new ListPojo();
        listPojo.setName(name.getText().toString());
        listPojo.setAge(age.getText().toString());
        listPojo.setCname(cname.getText().toString());
        list.add(listPojo);

        Sync sync = Sync.getSyncInstance();
        sync.setSampleList(list);

        Intent intent = new Intent(DetailActivity.this,ListActivity.class);
        startActivity(intent);
        finish();
    }
}