package com.anudip.exception;

public class CountryNotValidException  extends  RuntimeException{
    public CountryNotValidException(){
        System.out.println("Country not valid: 'The employee should be an Indian citizen for calculating tax' ");
    }
}
