package com.example.banhang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.google.android.material.navigation.NavigationView;

public class Main extends AppCompatActivity {
    Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerView;
    NavigationView navigationView;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
    }
    private void anhxa(){
        toolbar = findViewById(R.id.toolbarMain);
        viewFlipper = findViewById(R.id.viewflipperMain);
        navigationView = findViewById(R.id.navigationMain);
        listView = findViewById(R.id.listviewMain);
        viewFlipper = findViewById(R.id.viewflipperMain);
        recyclerView = findViewById(R.id.recyclerviewMain);

    }
}