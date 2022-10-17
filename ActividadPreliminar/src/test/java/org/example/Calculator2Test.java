package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Calculator2Test {
    @Test
    public void testAdd() {
        Calculator2 calculator = new Calculator2();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }
}
