package com.pankz.OOPS.builderdesignpattern.prepare_my_meal;

public class NonVegBuilder extends MealBuilder {
    private Meal meal;

    public NonVegBuilder() {
        meal=new Meal();
    }

    @Override
    public void addBiryani() {
       this.meal.setBriyani("chicken");
    }

    @Override
    public void addBread() {
        this.meal.setBread("roti");

    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("sprite");

    }

    @Override
    public void addCurry() {
        this.meal.setCurry("chicken");

    }

    @Override
    public Meal build() {
        return meal;
    }
}
