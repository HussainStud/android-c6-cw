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

        Item donut_item = new Item ("Donut", 2.56, R.drawable.donut_img);

        itemArrayList.add(donut_item);

        ItemAdapter itemArrayAdapter = new ItemAdapter(this, 0, itemArrayList);

        listViewItem.setAdapter(itemArrayAdapter);
    }
}