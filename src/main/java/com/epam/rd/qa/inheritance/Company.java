package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Company {
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        if (employees == null) {
            throw new IllegalArgumentException();
        }
        for (Employee i :
                employees) {
            if (i == null) {
                throw new IllegalArgumentException();
            }
        }
        this.employees = employees;
    }

                    public Company(Employee[] employees) {
                        if (employees == null) {throw new IllegalArgumentException();}
                        this.employees = employees;
        }
    public void giveEverybodyBonus(BigDecimal companyBonus) {
        if (companyBonus.compareTo(BigDecimal.ZERO) <= 0) {throw new IllegalArgumentException();}
        for (Employee i :
                employees) {
            i.setBonus(companyBonus);
        }
    }

    public BigDecimal totalToPay() {
        BigDecimal totalPay = BigDecimal.valueOf(0);
        for (Employee i: employees) {
            totalPay = totalPay.add(i.toPay());
        }
        return totalPay;
    }

    public String nameMaxSalary() {
        BigDecimal maxSalary = BigDecimal.valueOf(0);
        String maxEmp = "Nobody";
        for (Employee i :
                employees) {
            if (maxSalary.compareTo(i.toPay()) == -1) {
                maxSalary = i.toPay();
                maxEmp = i.getName();
            }
        }
        return maxEmp;
    }
}
