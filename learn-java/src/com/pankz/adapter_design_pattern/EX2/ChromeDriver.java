package com.pankz.adapter_design_pattern.EX2;

public class ChromeDriver implements  WebDriver {

        @Override
        public void getElement () {
            System.out.println("Get element from chrome driver");

        }

        @Override
        public void selectElement () {
            System.out.println("select element from chrome driver");

        }
    }
