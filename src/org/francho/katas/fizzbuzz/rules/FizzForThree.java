package org.francho.katas.fizzbuzz.rules;

import org.francho.katas.fizzbuzz.FizzBuzzContract;

public class FizzForThree implements KataRule {
    @Override
    public String run(String value, Integer number) {
        return (containsThree(number) || divisibleByThree(number)) ? FizzBuzzContract.FIZZ : "";
    }

    private Boolean containsThree(Integer number) {
        return number.toString().contains("3");
    }

    private Boolean divisibleByThree(Integer number) {
        return (number % 3 == 0);
    }
}
