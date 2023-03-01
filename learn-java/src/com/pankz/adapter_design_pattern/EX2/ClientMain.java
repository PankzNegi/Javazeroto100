package com.pankz.adapter_design_pattern.EX2;

public class ClientMain {
    public static void main(String[] args) {
        ChromeDriver a=new ChromeDriver();
        a.getElement();
        a.selectElement();   //getting and selecting from chrome driver(calling single interface chromedriver)

        IEdriver b=new IEdriver();
        b.findElement();       //getting and selecting from IE driver(calling single interface IEdriver)
        b.clickElement();

        WebDriver wid=new WebDriverAdapter(b);//Passing iedriver object
        wid.getElement();  //but calling methods of chromeDriver
        wid.selectElement();
    }
}
