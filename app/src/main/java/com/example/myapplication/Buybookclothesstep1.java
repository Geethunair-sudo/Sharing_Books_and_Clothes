package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.ListAdapter;

import java.util.logging.Handler;

public class Buybookclothesstep1 extends AppCompatActivity {
    private ListView list;
    SearchView mysearch;
    BuybookclothesAdapter adapter;


    String[] maintitle = {
            "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name", "Name",
    };

    String[] subtitle = {"Location", "Location", "Location", "Location", "Location", "Location", "Location", "Location", "Location", "Location", "Location", "Location", "Location"
    };

    String[] mobnumber = {"9656154484", "9744567201", "9744567201", "9744567201", "9654367810", "9654367810", "9654367810", "9654367810", "9654367810", "9654367810", "9654367810", "9654367810", "9654367810",};

    Integer[] imgid = {
            R.drawable.usericon, R.drawable.usericon,
            R.drawable.usericon, R.drawable.usericon,
            R.drawable.usericon, R.drawable.usericon, R.drawable.usericon,
            R.drawable.usericon, R.drawable.usericon,
            R.drawable.usericon, R.drawable.usericon, R.drawable.usericon,
            R.drawable.usericon,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buybookclothesstep1);

        mysearch = (SearchView) findViewById(R.id.searchView);

        final BuybookclothesAdapter adapter = new BuybookclothesAdapter(this, maintitle, subtitle, mobnumber, imgid);
        list = (ListView) findViewById(R.id.list1);
        list.setAdapter(adapter);
        mysearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub

                //code specific to first list item

                Intent intent = new Intent(Buybookclothesstep1.this, AccountCreated.class);

                //intent.putExtra("index",position);
                startActivity(intent);
                // Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();


                //code specific to 2nd list item
                //Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();


                //Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();

                //Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();


                //Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();


            }
        });
    }


}