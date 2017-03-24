package com.example.jorgen.poptabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jorgen on 3/23/2017.
 */

public class CoffeeFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Item 1","Ingredient 1,Ingredient 2","$ 2", R.drawable.bev_icon_1));
        words.add(new Word("Item 2","Ingredient 1,Ingredient 2","$ 3", R.drawable.bev_icon_2));
        words.add(new Word("Item 3","Ingredient 1,Ingredient 2","$ 4", R.drawable.bev_icon_3));
        words.add(new Word("Item 4","Ingredient 1,Ingredient 2","$ 5", R.drawable.bev_icon_4));
        words.add(new Word("Item 5","Ingredient 1,Ingredient 2","$ 5", R.drawable.bev_icon_5));
        words.add(new Word("Item 6","Ingredient 1,Ingredient 2","$ 2", R.drawable.bev_icon_6));
        words.add(new Word("Item 7","Ingredient 1,Ingredient 2","$ 2", R.drawable.bev_icon_7));
        words.add(new Word("Item 8","Ingredient 1,Ingredient 2","$ 2", R.drawable.bev_icon_8));
        words.add(new Word("Item 9","Ingredient 1,Ingredient 2","$ 3", R.drawable.bev_icon_9));

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words);
        final ListView listView = (ListView) rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id){


            }

        });



        return rootView;}


    }

