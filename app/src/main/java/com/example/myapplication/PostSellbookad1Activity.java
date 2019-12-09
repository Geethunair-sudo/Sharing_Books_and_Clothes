package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PostSellbookad1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postsellbookad1);
    }

    public void processPostnowLinkCLick(View view) {
        Intent intent = new Intent(this, CreatePasswordActivity.class);
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
