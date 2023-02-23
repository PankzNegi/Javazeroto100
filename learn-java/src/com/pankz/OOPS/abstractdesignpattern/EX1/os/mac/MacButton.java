package com.pankz.OOPS.abstractdesignpattern.EX1.os.mac;

import com.pankz.OOPS.abstractdesignpattern.EX1.uifactory.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");

    }
}

