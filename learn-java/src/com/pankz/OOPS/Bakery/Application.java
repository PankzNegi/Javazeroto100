package com.pankz.OOPS.Bakery;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        Customer ram=new Customer("Ram", BigDecimal.valueOf(5000));
        Customer shyam =new Customer("Shyam",BigDecimal.valueOf(2500));
        VendingMachine foodItemVendingMachine = VendingMachine.loadWith(
        new Item("Candy",BigDecimal.valueOf(1),100),
        new Item("Muffin",BigDecimal.valueOf(50),50),
        new Item("Chocolate",BigDecimal.valueOf(100),30));
        VendingMachine drinkItemVendingMachine = VendingMachine.loadWith()
                .addItem( new Item("Soft drink",BigDecimal.valueOf(15),10))
                .addItem( new Item("Apple beer",BigDecimal.valueOf(75),20));

    }
}
