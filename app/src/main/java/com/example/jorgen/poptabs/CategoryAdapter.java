package com.example.jorgen.poptabs;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


class CategoryAdapter extends FragmentPagerAdapter {
    private static final String HOME = "Home";
    private static final String FOOD = "Food";
    private static final String COFFEE = "Coffee+";
    private static final String BASKET = "Basket";
    private final String[] tabTitles = new String[]{HOME, FOOD, COFFEE, BASKET};


    CategoryAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new CoffeeFragment();
        } else {
            return new OrderFragment();
        }
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