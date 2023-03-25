package com.cydeo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME; // No need to have toString method. It's already overwritten
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println("How to get all constant");
        Currency[] currencies = Currency.values();// where is the values method we didn't write it
        System.out.println(Arrays.toString(currencies));

        System.out.println("=========================================================");

        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        System.out.println("How to use switch-case with enums");

        switch(Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }

    }

}
