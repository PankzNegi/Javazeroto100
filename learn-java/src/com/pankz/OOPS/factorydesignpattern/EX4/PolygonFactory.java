package com.pankz.OOPS.factorydesignpattern.EX4;

public class PolygonFactory {
    public Polygon getPolygon(int sides)
    {
        return switch (sides) {
            case 3 -> new Triangle();
            case 4 -> new Square();
            case 5 -> new Pentagon();
            default -> throw new RuntimeException("Invalid input");
        };
    }
}
