package com.anudip.exception;

public class TaxNotEligibleException extends  RuntimeException{

    public TaxNotEligibleException(){
        System.out.println("Not eligible for Tax calculation: “The employee does not need to pay tax” ");
    }
}
