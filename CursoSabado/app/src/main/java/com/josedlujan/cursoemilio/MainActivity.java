package com.josedlujan.cursoemilio;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] cadenas = new String[]{
            "1","2","3","4","5","1","2","3","4","5","1","2","3","4","5",
            "1","2","3","4","5","1","2","3","4","5","1","2","3","4","5"
    };
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        adapter = new MyAdapter(cadenas,this);
        recyclerView.setAdapter(adapter);
    }
}