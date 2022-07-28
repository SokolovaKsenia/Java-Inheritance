package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private final int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        if (percent < 0) {throw new IllegalArgumentException();}
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
           if (percent > 200) {
            bonus = bonus.multiply(BigDecimal.valueOf(3));
        }
           else if (percent > 100) {
            bonus = bonus.multiply(BigDecimal.valueOf(2));
        }
          super.setBonus(bonus);
    }
}
