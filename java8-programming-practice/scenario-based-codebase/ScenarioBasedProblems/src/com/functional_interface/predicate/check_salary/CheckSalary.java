package com.functional_interface.predicate.check_salary;

import java.util.function.Predicate;

public class CheckSalary {

    public static void main(String[] args) {

        // Predicate to check salary > 30000
        Predicate<Long> checkSalary = (totalSalary) -> totalSalary > 30000;

        System.out.println(checkSalary.test(6358L));   // false
        System.out.println(checkSalary.test(69358L));  // true
    }
}
