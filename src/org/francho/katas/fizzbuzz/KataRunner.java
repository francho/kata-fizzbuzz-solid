package org.francho.katas.fizzbuzz;

import org.francho.katas.fizzbuzz.rules.KataRules;

public class KataRunner {
    public static void main(String[] args) {
        final FizzBuzzBuilder builder = new FizzBuzzBuilder(new KataRules());
        for(int x=1;x<=100;x++) {
            System.out.println(builder.build(x));
        }
    }
}
