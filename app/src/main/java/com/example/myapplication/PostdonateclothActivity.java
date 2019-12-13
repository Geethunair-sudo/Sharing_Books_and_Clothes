package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PostdonateclothActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postdonatecloth);
    }

    public void processuploadimageLinkCLick(View view) {
        final int REQUEST_GALLERY = 0;
        String[] mimeTypes = {"image/jpeg", "image/png"};

        Intent galleryIntent = new Intent(
                Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        galleryIntent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
        startActivityForResult(galleryIntent, REQUEST_GALLERY);
    }

    public void processPostLinkCLick(View view) {
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



