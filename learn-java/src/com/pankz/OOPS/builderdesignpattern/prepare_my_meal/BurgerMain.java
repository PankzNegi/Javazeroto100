package com.pankz.OOPS.builderdesignpattern.prepare_my_meal;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger=new Burger.BurgerBuilder()
                .setMayonese(true)
                .setOnion(true)
                .setLettuce(false)
                .setExtraCheese(true)
                .setSize("Large")
                .build();
        System.out.println(burger);
        Meal meal=new MealDirector(new VegMealBuilder()).prepareMeal();
        System.out.println(meal);
    }
}
