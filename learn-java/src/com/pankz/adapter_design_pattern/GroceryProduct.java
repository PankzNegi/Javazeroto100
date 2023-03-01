package com.pankz.adapter_design_pattern;

public class GroceryProduct implements  GroceryItem{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPrice() {
        return null;
    }

    @Override
    public String getStoreName() {
        return null;
    }
}
//As i want to add my groceryitem as my item,i need to have the adapter here
// which will adapt the groceryitem to the item that i want to add

