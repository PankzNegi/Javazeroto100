package com.pankz.OOPS.Bakery;

import java.math.BigDecimal;

public class Customer {
    private String name;
    private BigDecimal amountInWallet;

    public Customer(String name, BigDecimal amountInWallet) {
        this.name = name;
        this.amountInWallet = amountInWallet;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmountInWallet() {
        return amountInWallet;
    }
}
