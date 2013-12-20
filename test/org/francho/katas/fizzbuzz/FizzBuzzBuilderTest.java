package org.francho.katas.fizzbuzz;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FizzBuzzBuilderTest {

    private static final int DIVISIBLE_BY_THREE = 6;
    private static final int DIVISIBLE_BY_FIVE = 10;
    private static final int DIVISIBLE_BY_THREE_AND_FIVE = 15;
    private static final int EVERY_ELSE = 8;
    private static final int CONTAINS_THREE = 38;
    private static final int CONTAINS_FIVE = 52;


    @Test
    public void shouldSayTheNumberByDefault() {
        FizzBuzzBuilder fizzBuzzBuilder = new FizzBuzzBuilder(EVERY_ELSE);

        final String expected = Integer.toString(EVERY_ELSE);
        final String actual = fizzBuzzBuilder.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSayFizzIfDivisibleByThree() {
        FizzBuzzBuilder fizzBuzzBuilder = new FizzBuzzBuilder(DIVISIBLE_BY_THREE);
        final String actual = fizzBuzzBuilder.toString();
        assertEquals(FizzBuzzContract.FIZZ, actual);
    }

    @Test
    public void shouldSayFizzIfDivisibleByFive() {
        FizzBuzzBuilder fizzBuzzBuilder = new FizzBuzzBuilder(DIVISIBLE_BY_FIVE);
        final String actual = fizzBuzzBuilder.toString();
        assertEquals(FizzBuzzContract.BUZZ, actual);
    }

    @Test
    public void shouldSayFizzBuzIfDivisibleByThreeAndFive() {
        FizzBuzzBuilder fizzBuzzBuilder = new FizzBuzzBuilder(DIVISIBLE_BY_THREE_AND_FIVE);
        final String actual = fizzBuzzBuilder.toString();
        assertEquals(FizzBuzzContract.FIZZ_BUZZ, actual);
    }

    @Test
    public void shouldSayFizzIfContainsThree() {
        FizzBuzzBuilder fizzBuzzBuilder = new FizzBuzzBuilder(CONTAINS_THREE);
        final String actual = fizzBuzzBuilder.toString();
        assertEquals(FizzBuzzContract.FIZZ, actual);
    }

    @Test
    public void shouldSayBuzzIfContainsFive() {
        FizzBuzzBuilder fizzBuzzBuilder = new FizzBuzzBuilder(CONTAINS_FIVE);
        final String actual = fizzBuzzBuilder.toString();
        assertEquals(FizzBuzzContract.BUZZ, actual);
    }
}
