package com.example.jorgen.poptabs;

/**
 * Created by Jorgen on 3/21/2017.
 */

public class Word {

    //Default name of product
    private String mProductName;

    //Product Price
    private String mProductPrice;
    //product Ingredients
    private String mIngredients;

    //Image resource ID for product
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
//Constructor for productName with Image
    public Word(String defaultName,String ingredients,String productPrice,int imageResourceId ){
        mProductName = defaultName;
        mProductPrice = productPrice;
        mImageResourceId = imageResourceId;
        mIngredients = ingredients;

    }

    public Word (String productPrice){

        mProductPrice = productPrice;


    }

    //get the productName
    public String getProductName(){
        return mProductName;
    }
    //get product's price

    public String getProductPrice(){
        return mProductPrice;
    }

    public String getmIngredients(){
        return mIngredients;
    }


    //get the image resource Id
    public int getImageResourceId() {
        return mImageResourceId;
    }
    // check whether image resource id is provided or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
