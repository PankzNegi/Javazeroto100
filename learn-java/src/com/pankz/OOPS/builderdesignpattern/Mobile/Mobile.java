package com.pankz.OOPS.builderdesignpattern.Mobile;

public class Mobile {
    private String name;
    private String color;
    private String processor;
    private String ram;

    private Mobile(Mobilebuilder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.processor = builder.processor;
        this.ram = builder.ram;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getProcessor() {
        return this.processor;
    }

    public String getRam() {
        return this.ram;
    }

    public static class Mobilebuilder {
        private String name;
        private String color;
        private String processor;
        private String ram;


        public Mobilebuilder (String name) {
            this.name = name;

        }

        public Mobilebuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Mobilebuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Mobilebuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }


        public  Mobile build()
        {
            return new Mobile(this);
        }

    }

    @Override
    public String toString() {
        return "Mobilebuilder{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}