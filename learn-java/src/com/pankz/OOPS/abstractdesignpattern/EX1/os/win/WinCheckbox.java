package com.pankz.OOPS.abstractdesignpattern.EX1.os.win;

import com.pankz.OOPS.abstractdesignpattern.EX1.uifactory.CheckBox;

public class WinCheckbox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Windows checkbox");
    }
}
