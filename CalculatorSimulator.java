package com.anudip.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxCalculator t1 = new TaxCalculator();
        double taxAmount=0;

        try {
            System.out.println("Enter your name:");
            t1.setName(scanner.nextLine().trim());
            System.out.println("You are indian enter True or false");
            t1.setIndian(scanner.nextBoolean());
            System.out.println("Enter your salary");
            t1.setSalary(scanner.nextDouble());
        }
        catch (InputMismatchException exe){
            System.out.println("Please enter valid Input");
        }
        try {

           taxAmount =  t1.calculateTax(t1.getName(), t1.isIndian(),t1.getSalary());
            System.out.println("Calculated Tax :"+taxAmount);
        }
        catch (CountryNotValidException exe){
            System.out.println(exe);
        }
        catch (EmployeeNameInvallidException exc){
            System.out.println(exc);
        }
        catch (TaxNotEligibleException tax){
            System.out.println(tax);
        }
    }
}
