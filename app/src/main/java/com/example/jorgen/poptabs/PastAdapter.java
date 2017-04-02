package com.example.jorgen.poptabs;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jorgen on 3/21/2017.
 */

public class PastAdapter extends ArrayAdapter<Past> {

    //Resource id for background color of list


    public PastAdapter(Activity context, ArrayList<Past> pasts) {
        super(context, 0, pasts);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // check if the current view is reused else inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the object located at position
        Past past_item = getItem(position);

        //find the textview in list_item with id default_text_view and price_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        TextView ingredientsTextView = (TextView) listItemView.findViewById(R.id.ingredients_text_view);
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price_text_view);

        //gets the product name and price and set it to the text of those textViews
        defaultTextView.setText(past_item.getProductName());
        ingredientsTextView.setText(past_item.getmIngredients());
        priceTextView.setText(past_item.getProductPrice());

        //find the image view with id image
        ImageView mImageView = (ImageView) listItemView.findViewById(R.id.image);
        if (past_item.hasImage()) {

            //get the imageResource get and set it as source of the image view
            mImageView.setImageResource(past_item.getImageResourceId());

            //make the image view visible
            mImageView.setVisibility(View.VISIBLE);
        } else {
            mImageView.setVisibility(View.GONE);
        }


        return listItemView;

    }
}
