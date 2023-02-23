package com.pankz.OOPS.abstractdesignpattern.EX1.os.mac;

import com.pankz.OOPS.abstractdesignpattern.EX1.uifactory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac checkbox");
    }
}
