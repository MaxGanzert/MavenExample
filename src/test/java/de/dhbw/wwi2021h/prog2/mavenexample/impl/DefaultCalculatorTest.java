package de.dhbw.wwi2021h.prog2.mavenexample.impl;

import de.dhbw.wwi2021h.prog2.mavenexample.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(OrderAnnotation.class)
public class DefaultCalculatorTest {

    @Order(1)
    @Test
    @DisplayName("Create valid Calculator")
    final void defaultCalculatorCreation() {
        Calculator calculator = new DefaultCalculator();

        assertNotNull(calculator);
    }

    @Order(2)
    @Test
    @DisplayName("Check add method")
    final void defaultCalculatorAdd() {
        Calculator calculator = new DefaultCalculator();

        long a = 10;
        long b = 25;
        long sum = a + b;

        long result = calculator.add(a, b);

        assertEquals(sum, result);
    }

    @Order(3)
    @Test
    @DisplayName("Check subtract method")
    final void defaultCalculatorSubtract() {
        Calculator calculator = new DefaultCalculator();

        long a = 10;
        long b = 25;
        long difference = a - b;

        long result = calculator.subtract(a, b);

        assertEquals(difference, result);

    }
    @Order(4)
    @Test
    @DisplayName("Check multiplication method")
    final void defaultCalculatorMultiplication(){
        Calculator calculator = new DefaultCalculator();
        long a = 10;
        long b = 20;
        long product = a*b;
        long result = calculator.multiplicate(a,b);
        assertEquals(product,result);
    }
    @Order(5)
    @Test
    @DisplayName("Check division method")
    final void defaultCalculatorDivision(){
        Calculator calculator = new DefaultCalculator();
        long a = 10;
        long b = 100;
        long quotient = a/b;
        double result = calculator.divide(a,b);
        assertEquals(quotient,result);
    }
    @Order(6)
    @Test
    @DisplayName("Check sum method")
    final void defaultCalculatorSum(){
        Calculator calculator = new DefaultCalculator();
        long sum=0;
        long[] arr = new long[3];
        arr[0] = 10;
        arr[1] = 33;
        arr[2] = -4;
        for(long elem: arr){
            sum =+elem;
        }
        long result = calculator.sum(arr);
        assertEquals(sum,result);
    }
    @Order(7)
    @Test
    @DisplayName("Check product method")
    final void defaultCalculatorProduct(){
        Calculator calculator = new DefaultCalculator();
        long product =1;
        long[] arr = new long[3];
        arr[0] = 10;
        arr[1] = 33;
        arr[2] = -4;
        for(long elem: arr){
            product =product*elem;
        }
        long result = calculator.product(arr);
        assertEquals(product,result);
    }
}