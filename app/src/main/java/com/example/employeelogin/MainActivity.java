package com.example.employeelogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private EditText ed_username;
    private EditText ed_password;
    private Button btn_submit;
    private ArrayList<ListModel> listArr;
    NetworkUtils gInstance = NetworkUtils.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_username = findViewById(R.id.ed_username);
        ed_password = findViewById(R.id.ed_password);
        btn_submit = findViewById(R.id.btn_submit);
        listArr = new ArrayList<>();

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkLogin();

            }
        });
    }

    private void checkLogin() {

        if (NetworkUtils.isConnected(MainActivity.this)) {
            GetListAPI getListApi = ApiClient.getClient().create(GetListAPI.class);
            Call<Example> call = getListApi.getList("flexi6","up","admin","en_US",ed_username.getText().toString(), ed_password.getText().toString());
            call.enqueue(new Callback<Example>() {
                @Override
                public void onResponse(@NonNull Call<Example> call, @NonNull Response<Example> response) {

                    Sync sync = Sync.getSyncInstance();
                    sync.setExample(response.body());



                    if(sync.getExample().getContext().getDetail()!= null && !sync.getExample().getContext().getDetail().isEmpty()){
                        Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                        startActivity(intent);
                        finish();
                    }else{

                        Toast.makeText(MainActivity.this,"error",Toast.LENGTH_SHORT).show();
                    }

                  //  checkValid();
                }

                @Override
                public void onFailure(@NonNull Call<Example> call, @NonNull Throwable t) {

                }
            });
        }
    }

   /* private void checkValid() {
        Sync sync  = Sync.getSyncInstance();
        if(sync.getResponseList().get())
    }*/
}