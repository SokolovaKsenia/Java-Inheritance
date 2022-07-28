package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final BigDecimal salary;
    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }
    private BigDecimal bonus;
    public Employee (String name, BigDecimal salary) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException();     }
        if (salary == null || salary.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException();     }
        this.name = name;
        this.salary = salary;
    }

    public void setBonus (BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.ZERO) <= 0) {throw new IllegalArgumentException(); }
        this.bonus = bonus;
    }

    public BigDecimal toPay() {
        return getSalary().add(bonus);
    }
}
