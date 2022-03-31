package de.dhbw.wwi2021h.prog2.mavenexample.impl;

import de.dhbw.wwi2021h.prog2.mavenexample.Calculator;

public class DefaultCalculator implements Calculator {
    @Override
    public long add(long addendA, long addendB) {
        return addendA + addendB;
    }

    @Override
    public long subtract(long minuend, long subtrahend) {
        return minuend - subtrahend;
    }

    @Override
    public long multiplicate(long numA, long numB){return numA*numB;}

    @Override
    public double divide(long numA, long numB) {return numA/numB;}

    @Override
    public long sum(long nums[]){
        long sum=0;
        for(long elem:nums){
            sum =+ elem;
    }
        return sum;
    }
    public long product(long[] nums){
        long product =1;
        for(long elem:nums){
            product =product*elem;
        }
        return product;
    }
}
