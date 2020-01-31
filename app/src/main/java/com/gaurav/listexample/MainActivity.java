package com.gaurav.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = findViewById(R.id.list);

        String[] nameList = {"Akshaya"," Aditya", "Devraj", "Himabindu", "K urmila", "N. Dharani", "Shankaresh"};
        myAdapter adapter = new myAdapter(this, nameList);
        myList.setAdapter(adapter);

    }

}
