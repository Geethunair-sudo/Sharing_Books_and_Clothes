package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CreatePasswordStep2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createpasswordstep2);
    }

    public void processSaveLinkCLick(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }




}
