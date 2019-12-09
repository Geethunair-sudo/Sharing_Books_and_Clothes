package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EmailloginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emaillogin);
    }

    public void processSigninLinkCLick(View view) {
        Intent intent = new Intent(this, SelectbooksorclothesActivity.class);
        startActivity(intent);
    }

    public void processforgotpasswordLinkCLick(View view) {
        Intent intent = new Intent(this, CreatePasswordemailloginActivity.class);
        startActivity(intent);
    }

}
