package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("4147011525","2022846483")),
                new Employee(100,"Ozzy","ozzy@cydeo.com", Arrays.asList("4146811525","2022846063")),
                new Employee(100,"Peter","peter@cydeo.com", Arrays.asList("4347011525","2022639483"))
        );
    }

}
