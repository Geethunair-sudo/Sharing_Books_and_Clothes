package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SelectbooksorclothesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectbookorclothes);
    }
    public void processbookLinkCLick(View view) {
        Intent intent = new Intent(this, SelectbookActivity.class);
        startActivity(intent);
    }
    public void processclothesLinkCLick(View view) {
        Intent intent = new Intent(this, SelectbookActivity.class);
        startActivity(intent);
    }
}
