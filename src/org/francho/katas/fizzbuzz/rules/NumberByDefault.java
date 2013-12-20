package org.francho.katas.fizzbuzz.rules;

public class NumberByDefault implements KataRule {
    @Override
    public String run(String value, Integer number) {
        return (value.length() == 0) ? number.toString() : "";
    }
}
