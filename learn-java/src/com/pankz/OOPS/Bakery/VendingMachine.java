package com.pankz.OOPS.Bakery;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Item> items;

    public VendingMachine() {
        this.items = new ArrayList<>();
    }

    public static VendingMachine loadWith(Item... items) {
        VendingMachine vendingMachine=new VendingMachine();
        if (items == null || items.length == 0) {
            return  vendingMachine;
        }
        for (Item item : items) {
            vendingMachine.addItem(item);
        }
        return vendingMachine;
    }

    public List<Item> getItem() {
        return items;
    }

    public VendingMachine addItem(Item item) {
        this.items.add(item);
        return this;

    }
}
