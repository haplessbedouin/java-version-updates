package com.cydeo.task;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        System.out.println("Question 1");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                //.map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print the length of the name of each dish
        System.out.println("Question 2");
        DishData.getAll().stream()
                //.map(dish -> dish.getName().length())
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::print);

        //Print three high caloric dish name (>300)
        System.out.println("Question 3");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted

        System.out.println("Question 4");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);




    }

}
