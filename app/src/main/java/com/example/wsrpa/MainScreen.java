package com.example.wsrpa;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainScreen extends AppCompatActivity {
    LoginResponse loginResponse;
    protected void onCreate(Bundle savedInstanceState) {
        TextView username;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);


        Intent i =getIntent();
        if(i.getExtras() != null){
            loginResponse=(LoginResponse) i.getSerializableExtra("data");

            Log.e("TAG",loginResponse.getEmail());
        }
    }

}
