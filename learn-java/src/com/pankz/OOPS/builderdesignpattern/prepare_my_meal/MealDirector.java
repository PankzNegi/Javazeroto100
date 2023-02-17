package com.pankz.OOPS.builderdesignpattern.prepare_my_meal;

public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
    public Meal prepareMeal()
    {
        mealBuilder.addBiryani();
        mealBuilder.addBread();
        mealBuilder.addCurry();
        mealBuilder.addColdDrink();
        return  mealBuilder.build();
    }
}
