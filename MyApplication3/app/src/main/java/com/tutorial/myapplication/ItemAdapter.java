package com.tutorial.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item> {

    List<Item> itemArrayList = new ArrayList<>();

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);

        itemArrayList = objects;
    }

 @NonNull
 @Override
 public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

          view = LayoutInflater.from(getContext()).inflate(R.layout.list_item_items, parent, false);

          Item currentItem = itemArrayList.get(position);

            TextView textView= view.findViewById(R.id.nameTextListItem);
            TextView priceTextView= view.findViewById(R.id.priceTextListItem);
            ImageView logoImageView= view.findViewById(R.id.imageViewListItem);

           textView.setText(currentItem.getItemName());
            priceTextView.setText("Price: " + currentItem.getItemPrice());
           logoImageView.setImageResource(currentItem.getItemImg());


           return view;

         }

}
