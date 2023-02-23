package com.pankz.OOPS.abstractdesignpattern.EX1.uifactory;

import com.pankz.OOPS.abstractdesignpattern.EX1.os.win.WinButton;
import com.pankz.OOPS.abstractdesignpattern.EX1.os.win.WinCheckbox;

public class WinUIFactory implements  UIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckbox();
    }
}
