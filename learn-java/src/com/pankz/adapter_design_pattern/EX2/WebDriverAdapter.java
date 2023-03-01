package com.pankz.adapter_design_pattern.EX2;

public class WebDriverAdapter implements WebDriver{
    IEdriver iedriver; //Object/instance of Adaptee (IEdriver)

    public WebDriverAdapter(IEdriver iedriver) { //Passing object in constructor
        this.iedriver = iedriver;
    }

    @Override
    public void getElement() {
        iedriver.findElement(); //Adapting (calling the function of Adaptee(IEdiver))
        //getElement pointing to findElement
    }

    @Override
    public void selectElement() {
        iedriver.clickElement();  //Adapting  (calling the function of Adaptee(IEdiver))
     //selectElement pointing to clickElement
    }
}
