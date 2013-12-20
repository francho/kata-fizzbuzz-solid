package org.francho.katas.fizzbuzz;

public class Runner {
    public static void main(String[] args) {
        for(int x=1;x<=100;x++) {
            FizzBuzzBuilder builder = new FizzBuzzBuilder(x);
            System.out.println(builder);
        }
    }
}
