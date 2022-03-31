package de.dhbw.wwi2021h.prog2.mavenexample;

/**
 * Base interface for a really cheap calculator
 *
 * @author Lukas Paffen
 */
public interface Calculator {
    /**
     * Adds two numbers
     *
     * @param addendA Left of plus operator
     * @param addendB Right of plus operator
     * @return Sum
     */
    long add(long addendA, long addendB);

    /**
     * Subtracts two numbers
     *
     * @param minuend    Left of minus operator
     * @param subtrahend Right of minus operator
     * @return Difference
     */
    long subtract(long minuend, long subtrahend);
    long multiplicate(long numA, long numB);
    double divide(long numA, long numB);
    long sum(long[] nums);
    long product(long[] nums);
}
