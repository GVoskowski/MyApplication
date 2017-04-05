package com.example.jorgen.poptabs;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class FoodFragment extends Fragment {
    ListItemSelection activityCommander;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            activityCommander = (ListItemSelection) context;

        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Past> pasts = new ArrayList<>();
        pasts.add(new Past("Item 1", "Ingredient 1,Ingredient 2", "Price", R.drawable.food_icon_1));
        pasts.add(new Past("Item 2", "Ingredient 1,Ingredient 2", "Price", R.drawable.food_icon_2));
        pasts.add(new Past("Item 3", "Ingredient 1,Ingredient 2", "Price", R.drawable.food_icon_3));
        pasts.add(new Past("Item 4", "Ingredient 1,Ingredient 2", "Price", R.drawable.food_icon_4));
        pasts.add(new Past("Item 5", "Ingredient 1,Ingredient 2", "Price", R.drawable.food_icon_5));
        pasts.add(new Past("Item 6", "Ingredient 1,Ingredient 2", "Price", R.drawable.food_icon_6));
        pasts.add(new Past("Item 7", "Ingredient 1,Ingredient 2", "Price", R.drawable.food_icon_7));
        pasts.add(new Past("Item 8", "Ingredient 1,Ingredient 2", "Price", R.drawable.food_icon_8));
        pasts.add(new Past("Item 9", "Ingredient 1,Ingredient 2", "Price", R.drawable.food_icon_9));
        PastAdapter itemsAdapter = new PastAdapter(getActivity(), pasts);
        final ListView listView = (ListView) rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Past past = (Past) adapterView.getItemAtPosition(position);
                itemSelected(past);
            }
        });
        return rootView;
    }
    public void itemSelected(Past order) {
        activityCommander.addToList(order);
    }
}