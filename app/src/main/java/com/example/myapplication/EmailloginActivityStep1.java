package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EmailloginActivityStep1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emailloginstep1);
    }

    public void processSigninLinkCLick(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


}
