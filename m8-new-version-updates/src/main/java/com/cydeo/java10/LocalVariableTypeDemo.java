package com.cydeo.java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {
    public static void main(String[] args) {

        var str = "Cydeo";// String
        var number = 5;// int

        byte x = 1;
        var y = 1;// int

        var price = 12.5; //double

        var numbers = Arrays.asList(3,4,5,6);

        var sum = 0;
        for(var eachNumber : numbers){
            sum = sum+eachNumber;

            // var type is a local variable, you can not use as instance (class member), method parameters and return values

        }

    }

}
