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

public class WordAdapter extends ArrayAdapter<Word> {

    //Resource id for background color of list


    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // check if the current view is reused else inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the object located at position
        Word word_item = getItem(position);

        //find the textview in list_item with id default_text_view and price_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        TextView ingredientsTextView = (TextView)listItemView.findViewById(R.id.ingredients_text_view);
        TextView priceTextView = (TextView)listItemView.findViewById(R.id.price_text_view);

        //gets the product name and price and set it to the text of those textViews
        defaultTextView.setText(word_item.getProductName());
        ingredientsTextView.setText(word_item.getmIngredients());
        priceTextView.setText(word_item.getProductPrice());

        //find the image view with id image
        ImageView mImageView = (ImageView) listItemView.findViewById(R.id.image);
        if(word_item.hasImage()) {

            //get the imageResource get and set it as source of the image view
            mImageView.setImageResource(word_item.getImageResourceId());

            //make the image view visible
            mImageView.setVisibility(View.VISIBLE);
        }
        else {
            mImageView.setVisibility(View.GONE);
        }




        return listItemView;

    }
}
