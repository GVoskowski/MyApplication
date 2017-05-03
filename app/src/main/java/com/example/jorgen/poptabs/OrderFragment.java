package com.example.jorgen.poptabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class OrderFragment extends Fragment {
    public static void showSelectedItems(String name, String price) {
        String selectedItemname = name;
        String selectedItemprice = price;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Past> pasts = ((MainActivity) getActivity()).getOrders();
        final ListView listView = (ListView) rootView.findViewById(R.id.word_list);
        final PastAdapter itemsAdapter = new PastAdapter(getActivity(), pasts);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                itemsAdapter.remove(position);
            }
        });
        return rootView;
    }
}
