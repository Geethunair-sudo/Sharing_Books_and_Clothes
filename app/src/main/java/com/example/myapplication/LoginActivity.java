package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void processSignupLinkCLick(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);


    }
    public void processphoneloginCLick(View view) {
        Intent intent = new Intent(this, PhoneloginActivity.class);
        startActivity(intent);


    }
    public void processemailloginCLick(View view) {
        Intent intent = new Intent(this, EmailloginActivity.class);
        startActivity(intent);


    }

}
