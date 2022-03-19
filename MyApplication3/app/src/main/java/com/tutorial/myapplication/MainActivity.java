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
        Item chocolate_item = new Item ("Chocolate", 9.65, R.drawable.chocolate_img);
        Item coffee_item = new Item ("Coffee", 4.36, R.drawable.coffee_img);
        Item cheese_item = new Item ("Cheese", 13.41, R.drawable.cheese_img);
        Item honey_item = new Item ("Honey", 51.01, R.drawable.honey_img);
        Item fries_item = new Item ("Fries", 1.99, R.drawable.fries_img);

        itemArrayList.add(donut_item);
        itemArrayList.add(chocolate_item);
        itemArrayList.add(coffee_item);
        itemArrayList.add(cheese_item);
        itemArrayList.add(honey_item);
        itemArrayList.add(fries_item);

        ItemAdapter itemArrayAdapter = new ItemAdapter(this, 0, itemArrayList);

        listViewItem.setAdapter(itemArrayAdapter);
    }
}