package com.anudip.exception;

public class TaxCalculator {
    private String name;
    private boolean isIndian;
    private double salary;
    public double taxAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIndian() {
        return isIndian;
    }

    public void setIndian(boolean indian) {
        isIndian = indian;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateTax(String name, boolean isIndian, double salary) {
        if (isIndian) {
            if (name.isEmpty() || name.equalsIgnoreCase("null")) {
                throw new EmployeeNameInvallidException();
            } else if (salary >100000) {
                taxAmount = salary * 8/100;
                return taxAmount;
            } else if (salary>50000 && salary <=100000) {
                System.out.println(salary);
                taxAmount = salary * 6/100;
                return taxAmount;

            } else if (salary >30000 && salary<=50000) {
                taxAmount = salary * 5/100;
                return taxAmount;
            } else if (salary >=10000 && salary <=30000) {
                taxAmount = salary * 4/100;
                return taxAmount;
            }
            else{
                throw new TaxNotEligibleException();
            }
        }
        else {
            throw new CountryNotValidException();
        }
    }
}
