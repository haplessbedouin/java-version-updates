package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        //with initial value
        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);

        //without initial value (returns optional since there is no initial value)
        Optional<Integer> result2 = numbers.stream().reduce((a,b) -> a+b);

        System.out.println("Total dish calories");
        Optional<Integer> calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
//                .reduce((a,b) -> a+b)
                .reduce(Integer::sum);
               // .get(); //we used get method to return an integer or else we have to use optional

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());

    }

}
