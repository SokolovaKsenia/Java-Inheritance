package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private BigDecimal salary;
    private BigDecimal bonus;

//    public String getName (String name) {
//        if (name == null)
//            throw new IllegalArgumentException();
//         return name;
//    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

//    public BigDecimal getSalary (BigDecimal salary) {
//        if (salary.compareTo(BigDecimal.ZERO) < 0)  throw new IllegalArgumentException();
//        return salary;
//    }

    public Employee (String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setBonus (BigDecimal bonus) {
        if (bonus.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException();
        this.bonus = bonus;
    }

    public BigDecimal toPay() {
        return salary.add(bonus);
    }
}
