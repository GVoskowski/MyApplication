package com.example.jorgen.poptabs;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jorgen on 3/21/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Home", "Food","Coffee +"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if(position == 0) {
            return new HomeFragment();}


        else if (position == 1){
            return new FoodFragment();}

        /*  else if (position == 2) {
            return new FamilyFragment();
        }
*/
       else {
            return new CoffeeFragment();}

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
