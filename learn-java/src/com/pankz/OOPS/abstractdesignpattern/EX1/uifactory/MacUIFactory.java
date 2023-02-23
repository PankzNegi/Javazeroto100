package com.pankz.OOPS.abstractdesignpattern.EX1.uifactory;

import com.pankz.OOPS.abstractdesignpattern.EX1.os.mac.MacButton;
import com.pankz.OOPS.abstractdesignpattern.EX1.os.mac.MacCheckBox;

public class MacUIFactory implements  UIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
