package com.ecse437.project;

import com.ecse437.project.math.CelsiusToFahrenheit;
import com.ecse437.project.math.CoordinateDistance;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IntegrationTest {
    static CelsiusToFahrenheit celsius;
    static CoordinateDistance coordinateDistance;


    @BeforeAll
    static void setEnvironment(){
        celsius = new CelsiusToFahrenheit();
        coordinateDistance = new CoordinateDistance();
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, celsius.convert(0));
        assertEquals(55, celsius.convert(13));
        assertEquals(392, celsius.convert(200));
        assertEquals(23, celsius.convert(-5));
        assertEquals(-459, celsius.convert(-273));
    }

    @Test
    void testCoordinateDistance() {
        assertEquals(5, coordinateDistance.value(1,4,1,5));
        assertEquals(2, coordinateDistance.value(1,2,4,6));
        assertEquals(132, coordinateDistance.value(0,100,22.5,-64.5));
    }
}
