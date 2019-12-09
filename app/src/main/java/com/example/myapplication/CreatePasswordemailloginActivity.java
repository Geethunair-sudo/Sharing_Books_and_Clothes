package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CreatePasswordemailloginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createpasswordemaillogin);
    }

    public void processforgotpasswordLinkCLick(View view) {
        Intent intent = new Intent(this, CreatePasswordemailloginActivity.class);
        startActivity(intent);
    }
    public void processNextLinkCLick(View view) {
        Intent intent = new Intent(this, CreatePasswordStep1Activity.class);
        startActivity(intent);
    }


}
