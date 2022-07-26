package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {
        if (companyBonus.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException();
        for (Employee i :
                employees) {
            i.setBonus(companyBonus);
        }
    }
        public BigDecimal totalToPay () {
            BigDecimal totalSalary = BigDecimal.valueOf(0);
            for (int i = 0; i < employees.length; i++) {
                totalSalary = totalSalary.add(employees[i].toPay());
            }
            return totalSalary;
        }

        public String nameMaxSalary () {
            BigDecimal maxSalary = BigDecimal.valueOf(0);
            String maxEmp = "";
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

//
//    public String nameMaxSalary() {
//        BigDecimal maxSal = BigDecimal.valueOf(0);
//        String maxStr = "Nobody";
//        for (Employee e:
//                employees) {
//            if (maxSal.compareTo(e.toPay()) == -1) {
//                maxSal = e.toPay();
//                maxStr = e.getName();
//            }
//        }
//        return maxStr;
//    }