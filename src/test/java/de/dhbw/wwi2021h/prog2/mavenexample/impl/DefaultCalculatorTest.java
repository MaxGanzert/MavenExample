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
    final void defaultCalculatorMultiplicationn(){
        Calculator calculator = new DefaultCalculator();
        long a = 10;
        long b = 20;
        long product = a*b;
        long result = calculator.multiplicate(a,b);
        assertEquals(product,result);
    }

}
