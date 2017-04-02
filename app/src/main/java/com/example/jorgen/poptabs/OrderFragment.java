package com.example.jorgen.poptabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jorgen on 3/24/2017.
 */

public class OrderFragment extends Fragment {
    private static String selectedItemname;
    private static String selectedItemprice;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Past> pasts = new ArrayList<>();


        pasts.add(new Past(selectedItemname, selectedItemprice));


        ListView listView = (ListView) rootView.findViewById(R.id.word_list);
        PastAdapter itemsAdapter = new PastAdapter(getActivity(), pasts);
        listView.setAdapter(itemsAdapter);


        return rootView;
    }

    public void showSelectedItems(String name, String price) {

        selectedItemname = name;
        selectedItemprice = price;
    }


}
