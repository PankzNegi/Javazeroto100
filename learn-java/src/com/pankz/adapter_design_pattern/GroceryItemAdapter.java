package com.pankz.adapter_design_pattern;

public class GroceryItemAdapter implements  Item{
    private GroceryItem item; // Property of GroceryItem (instances of GroceryItem)

    //Constructor
    public GroceryItemAdapter(GroceryItem item)  {
        this.item = item;
    }

    @Override
    public String getItemName() { //Adding regular items
        return item.getName();
    }

    @Override
    public String getPrice() {
        return item.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return item.getStoreName(); //adapting(converting restaurant to storename)
    }
}
