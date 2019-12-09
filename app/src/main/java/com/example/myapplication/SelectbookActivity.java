package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SelectbookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectbook);
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
    public void processsellLinkCLick(View view) {
        Intent intent = new Intent(this, PostsellbookadActivity.class);
        startActivity(intent);
    }
    public void processbuyLinkCLick(View view) {
        Intent intent = new Intent(this, SelectbooksorclothesActivity.class);
        startActivity(intent);
    }
    public void processdonateLinkCLick(View view) {
        Intent intent = new Intent(this, PostdonatebookActivity.class);
        startActivity(intent);
    }

}
