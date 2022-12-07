package com.ecse437.project;

import com.ecse437.project.math.CelsiusToFahrenheit;
import com.ecse437.project.math.CelsiusToFahrenheit;
import com.ecse437.project.math.CoordinateDistance;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IntegrationTest {
    CelsiusToFahrenheit celsius = new CelsiusToFahrenheit();
    CoordinateDistance coordinateDistance = new CoordinateDistance();
    @Test
    void testCelsiusToFahrenheit() {
        int celsiusValue = 18;
        assertEquals(64, celsius.convert(celsiusValue));
    }

    @Test
    void testCoordinateDistance() {
        assertEquals(5, coordinateDistance.value(1,4,1,5));
    }
}
