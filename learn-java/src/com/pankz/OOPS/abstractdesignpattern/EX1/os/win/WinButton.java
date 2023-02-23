package com.pankz.OOPS.abstractdesignpattern.EX1.os.win;


import com.pankz.OOPS.abstractdesignpattern.EX1.uifactory.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
