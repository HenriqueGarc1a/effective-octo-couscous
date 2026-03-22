package com.example.bee1168;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LedTest{

    @Test
    @DisplayName("Number: 115380")
    void countLeds() {
        Led led = new Led();
        assertEquals(27, led.countLeds("115380"));
    }

    

}