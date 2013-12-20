package org.francho.katas.fizzbuzz;

import org.francho.katas.fizzbuzz.rules.KataRule;
import org.francho.katas.fizzbuzz.rules.KataRules;

public class FizzBuzzBuilder {

    private final KataRules rules;
    private String value = null;

    FizzBuzzBuilder(int number) {
        rules = new KataRules();
        build(number);
    }

    public String build(int number) {
        value = "";

        for(KataRule rule : rules) {
            value += rule.run(value,number);
        }

        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
