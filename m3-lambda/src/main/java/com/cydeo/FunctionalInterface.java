package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() { // Anonymous class
            @Override
            public boolean test(Apple apple) {
                return false;
            }
        };

        //********************PREDICATE************************// Accepts an object and returns a boolean

        Predicate<Integer> lessThan = i -> i<18;
        System.out.println(lessThan.test(20));

        //*******************CONSUMER**************************// Accepts an object and doesn't return anything (void)

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        //*******************BICONSUMER***********************// Accepts two different objects returns void
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(1,2);

        //*****************FUNCTION*********************** Accepts an object and returns an object
        Function<String,String> fun  = s -> "Hello" + s;
        System.out.println(fun.apply("Cydeo"));

        //************************BIFUNCTION**************************************** Accepts two objects and returns one object
        BiFunction<Integer,Integer,Integer> func = (x1,x2) -> x1+x2;
        System.out.println(func.apply(2,3));

        //****************************SUPPLIER********************************* Accepts nothing returns an object
        Supplier<Double> randomValue = () -> Math.random();
        randomValue.get();




    }

}
