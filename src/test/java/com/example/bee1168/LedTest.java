package com.example.bee1168;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LedTest{

   @ParameterizedTest()
    @CsvSource({
        "115380, 27",
        "2819311, 29",
        "23456, 25"
    })
    void countLeds(String input, int expected) {
        Led led = new Led();
        assertEquals(expected, led.countLeds(input));
    }
    

}