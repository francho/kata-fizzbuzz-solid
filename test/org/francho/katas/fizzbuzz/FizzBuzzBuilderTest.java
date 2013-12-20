package org.francho.katas.fizzbuzz;


import org.francho.katas.fizzbuzz.rules.KataRules;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static junit.framework.Assert.assertEquals;

public class FizzBuzzBuilderTest {

    private FizzBuzzBuilder fizzBuzzBuilder;

    private static final int DIVISIBLE_BY_THREE = 6;
    private static final int DIVISIBLE_BY_FIVE = 10;
    private static final int DIVISIBLE_BY_THREE_AND_FIVE = 15;
    private static final int EVERY_ELSE = 8;
    private static final int CONTAINS_THREE = 38;
    private static final int CONTAINS_FIVE = 52;

    @Before
    public void setUp() {
        this.fizzBuzzBuilder = new FizzBuzzBuilder(new KataRules());
    }

    @Test(expected = InvalidParameterException.class)
    public void needsRulesToRun() {
        new FizzBuzzBuilder(null);
    }

    @Test
    public void shouldSayTheNumberByDefault() {
        final String expected = Integer.toString(EVERY_ELSE);
        final String actual = fizzBuzzBuilder.build(EVERY_ELSE);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSayFizzIfDivisibleByThree() {
        final String actual = fizzBuzzBuilder.build(DIVISIBLE_BY_THREE);
        assertEquals(FizzBuzzContract.FIZZ, actual);
    }

    @Test
    public void shouldSayFizzIfDivisibleByFive() {
        final String actual = fizzBuzzBuilder.build(DIVISIBLE_BY_FIVE);
        assertEquals(FizzBuzzContract.BUZZ, actual);
    }

    @Test
    public void shouldSayFizzBuzIfDivisibleByThreeAndFive() {
        final String actual = fizzBuzzBuilder.build(DIVISIBLE_BY_THREE_AND_FIVE);
        assertEquals(FizzBuzzContract.FIZZ_BUZZ, actual);
    }

    @Test
    public void shouldSayFizzIfContainsThree() {
        final String actual = fizzBuzzBuilder.build(CONTAINS_THREE);
        assertEquals(FizzBuzzContract.FIZZ, actual);
    }

    @Test
    public void shouldSayBuzzIfContainsFive() {
        final String actual = fizzBuzzBuilder.build(CONTAINS_FIVE);
        assertEquals(FizzBuzzContract.BUZZ, actual);
    }
}
