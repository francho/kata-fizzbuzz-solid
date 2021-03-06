package org.francho.katas.fizzbuzz.rules;

import org.francho.katas.fizzbuzz.FizzBuzzContract;

public class BuzzForFive implements KataRule {
    @Override
    public String run(String value, Integer number) {
        return (divisibleByFive(number) || containsFive(number)) ? FizzBuzzContract.BUZZ : "";
    }

    private Boolean containsFive(Integer number) {
        return number.toString().contains("5");
    }

    private Boolean divisibleByFive(Integer number) {
        return number % 5 == 0;
    }
}