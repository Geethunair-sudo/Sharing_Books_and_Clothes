package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PhoneloginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonelogin);
    }

    public void processforgotpasswordLinkCLick(View view) {
        Intent intent = new Intent(this, CreatePasswordActivity.class);
        startActivity(intent);
    }

    public void processSigninLinkCLick(View view) {
        Intent intent = new Intent(this, SelectbooksorclothesActivity.class);
        startActivity(intent);
    }


}
