package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PostsellclothadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postsellclothad);
    }

    public void processNextLinkCLick(View view) {
        Intent intent = new Intent(this, AccountCreated.class);
        startActivity(intent);
    }

    public void processChatLinkCLick(View view) {
        Intent intent = new Intent(this, AccountCreated.class);
        startActivity(intent);
    }

    public void processMyADLinkCLick(View view) {
        Intent intent = new Intent(this, AccountCreated.class);
        startActivity(intent);
    }

    public void processMyaccountLinkCLick(View view) {
        Intent intent = new Intent(this, AccountCreated.class);
        startActivity(intent);
    }
}



