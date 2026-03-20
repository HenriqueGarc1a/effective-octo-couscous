package com.example.bee1001;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTests {

    @Test
    @DisplayName("10 + 9 = 19")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(109, calculator.add(10, 9), "10 + 9 should equal 19");
    }

}