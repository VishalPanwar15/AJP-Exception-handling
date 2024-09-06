package com.anudip.exception;

public class EmployeeNameInvallidException extends RuntimeException {
    public EmployeeNameInvallidException(){
        System.out.println(" Employee name not valid: “The employee name cannot be empty” ");
    }
}
