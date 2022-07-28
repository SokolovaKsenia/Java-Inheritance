package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Manager extends Employee {
    private final int clientAmount;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        if (clientAmount < 0) {throw new IllegalArgumentException();}
        this.clientAmount = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
          if (clientAmount > 150) {
              super.setBonus(bonus.add(BigDecimal.valueOf(1000)));
          } else if (clientAmount > 100) {
              super.setBonus(bonus.add(BigDecimal.valueOf(500)));}
          else {super.setBonus(bonus);
        }
    }
}

