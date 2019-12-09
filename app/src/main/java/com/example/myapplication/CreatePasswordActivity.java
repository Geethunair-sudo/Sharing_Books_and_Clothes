package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CreatePasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createpassword);
    }

    public void processforgotpasswordLinkCLick(View view) {
        Intent intent = new Intent(this, CreatePasswordActivity.class);
        startActivity(intent);
    }
    public void processNextLinkCLick(View view) {
        Intent intent = new Intent(this, CreatePasswordStep1Activity.class);
        startActivity(intent);
    }


}
