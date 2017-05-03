package com.example.jorgen.poptabs;


class Past {
    private static final int NO_IMAGE_PROVIDED = -1;
    //Default name of product
    private final String mProductName;
    //Product Price
    private final String mProductPrice;
    //product Ingredients
    private String mIngredients;
    //Image resource ID for product
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //Constructor for productName with Image
    Past(String defaultName, String productPrice, int imageResourceId) {
        mProductName = defaultName;
        mProductPrice = productPrice;
        mImageResourceId = imageResourceId;
        mIngredients = "Ingredient 1,Ingredient 2";
    }

    public Past(String defaultName, String productPrice) {
        mProductName = defaultName;
        mProductPrice = productPrice;
    }

    //get the productName
    String getProductName() {
        return mProductName;
    }

    //get product's price
    String getProductPrice() {
        return mProductPrice;
    }

    String getmIngredients() {
        return mIngredients;
    }

    //get the image resource Id
    int getImageResourceId() {
        return mImageResourceId;
    }

    // check whether image resource id is provided or not
    boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}