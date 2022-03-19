package com.tutorial.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> itemArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listViewItem = findViewById(R.id.listViewItem);

        Item item1 = new Item ("Bread Talk", 1.56, R.drawable.bread_talk_logo);

        itemArrayList.add(item1);
    }
}