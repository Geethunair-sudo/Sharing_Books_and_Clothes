package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SelectclothActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectcloth);
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
    public void processsellclothLinkCLick(View view) {
        Intent intent = new Intent(this, PostsellclothadActivity.class);
        startActivity(intent);
    }
    public void processbuyclothLinkCLick(View view) {
        Intent intent = new Intent(this, Buybookclothesstep1.class);
        startActivity(intent);
    }
    public void processdonateclothLinkCLick(View view) {
        Intent intent = new Intent(this, PostdonateclothActivity.class);
        startActivity(intent);
    }

}
