package com.pankz.OOPS.builderdesignpattern.prepare_my_meal;

public class Burger {
    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;

    private Burger(BurgerBuilder builder) {
        //assigning values to objects
        this.size = builder.size;
        this.egg = builder.egg;
        this.extraCheese = builder.extraCheese;
        this.mayonese = builder.mayonese;
        this.onion = builder.onion;
        this.lettuce = builder.lettuce;
    }
//Getters-Returning same object everytime that is builder instances
    //Once builder method invoke return actual objects
    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }
    public static class BurgerBuilder //inner static class
    {
        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean mayonese;
        private boolean onion;
        private boolean lettuce;



    public BurgerBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public BurgerBuilder setEgg(boolean egg) {
        this.egg = egg;
        return this;
    }

    public BurgerBuilder setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this;
    }

    public BurgerBuilder setMayonese(boolean mgyonese) {
        this.mayonese = mgyonese;
        return this;
    }

    public BurgerBuilder setOnion(boolean onion) {
        this.onion = onion;
        return this;
    }

    public BurgerBuilder setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        return  this;
    }
    public Burger build()
    {
        return new Burger(this);
    }
}

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", egg=" + egg +
                ", extraCheese=" + extraCheese +
                ", mayonese=" + mayonese +
                ", onion=" + onion +
                ", lettuce=" + lettuce +
                '}';
    }
}
