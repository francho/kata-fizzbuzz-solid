package org.francho.katas.fizzbuzz.rules;

import java.util.ArrayList;

public class KataRules extends ArrayList<KataRule> {
    public KataRules() {
        super();
        this.add(new FizzForThree());
        this.add(new BuzzForFive());
        this.add(new NumberByDefault());
    }
}
