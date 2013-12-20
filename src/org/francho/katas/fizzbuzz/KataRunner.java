package org.francho.katas.fizzbuzz;

public class KataRunner {
    public static void main(String[] args) {
        final FizzBuzzBuilder builder = new FizzBuzzBuilder(0);
        for(int x=1;x<=100;x++) {
            System.out.println(builder.build(x));
        }
    }
}
