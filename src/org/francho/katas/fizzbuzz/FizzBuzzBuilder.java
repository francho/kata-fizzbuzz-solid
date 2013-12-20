package org.francho.katas.fizzbuzz;

import org.francho.katas.fizzbuzz.rules.KataRule;
import org.francho.katas.fizzbuzz.rules.KataRules;

import java.security.InvalidParameterException;

public class FizzBuzzBuilder {

    private final KataRules rules;

    FizzBuzzBuilder(KataRules rules) {
        if(rules == null) {
            throw new InvalidParameterException("rules cannot be null");
        }

        this.rules = rules;
    }

    public String build(Integer number) {
        String value = "";

        for(KataRule rule : rules) {
            value += rule.run(value,number);
        }

        return value;
    }
}
