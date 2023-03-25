package com.cydeo;

public class Main {

    public static void main(String[] args) {

        System.out.println("Operation Task");
        calculate(3,5,MathOperators.PLUS);

    }

    private static void calculate(double x, double y, MathOperators operation){

        switch(operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }

    }

}
