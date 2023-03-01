package com.pankz.adapter_design_pattern;

public class ClientMain {
    public static void main(String[] args) {
        SwiggyStore swiggyStore=new SwiggyStore();
        swiggyStore.addItems(new FoodItem());
        swiggyStore.addItems(new FoodItem());
        //Adapter grocery which was incompatible with food.
        SwiggyStore.addItems(new GroceryItemAdapter(new GroceryProduct()));
    }
}
