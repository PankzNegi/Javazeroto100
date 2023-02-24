package com.pankz.OOPS.factorydesignpattern.EX2;

import java.util.Objects;

public class VehicleFactory {
    public Vehicle getInstance(String type,int wheel)
    {
        if(Objects.equals(type, "car"))
        {
            return new Car(wheel);
        } else if (Objects.equals(type, "bike")) {
            return  new Bike(wheel);

        }
        return null;
    }
}
/*
Sole purpose of factory design is-  A super classes has many subclasses and there can be many changes in the future
so we need to create the factory that handle everything.
we only need to change the factory class if any changes happens
 */
