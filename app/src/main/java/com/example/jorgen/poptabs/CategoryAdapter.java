package com.example.jorgen.poptabs;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jorgen on 3/21/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Home", "Food","Coffee +","Basket"};



    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        if(position == 0) {
            return new HomeFragment();
                }


        else if (position == 1){
            return new FoodFragment();}
        else if (position == 2){
            return new CoffeeFragment();}


       else {
            return new OrderFragment();}

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}
