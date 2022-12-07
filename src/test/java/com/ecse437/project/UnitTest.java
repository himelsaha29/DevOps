package com.ecse437.project;

import com.ecse437.project.math.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UnitTest {

    @Test
    void testAbsolute() {
        int values[] = new int[] {-6, -1, 0, 24, 11};

        for(int i = 0; i < values.length; i++) {
            assertEquals(Math.abs(values[i]), Absolute.value(values[i]));
        }

    }
    @Test
    void testRound() {
        float values[] = new float[] {-700f, -6.3f, -1.1f, 0.0f, 24.32f, 11.02f, 899.9f};

        for(int i = 0; i < values.length; i++) {
            assertEquals(Math.round(values[i]), Round.value(values[i]));
        }

    }
    @Test
    void testSquareRoot() {
        double values[] = new double[] {-6.3, -1.1, 0.0, 24.32, 11.02};

        for(int i = 0; i < values.length; i++) {
            assertEquals(Math.sqrt(values[i]), SquareRoot.value(values[i]));
        }
        assertEquals(Math.sqrt(Double.NaN), SquareRoot.value(Double.NaN));


    }
    @Test
    void testLogBase10() {
        double values[] = new double[] {-6.3, -1.1, 0.0, 24.32, 11.02};

        for(int i = 0; i < values.length; i++) {
            assertEquals((int)Math.log10(values[i]), LogBase10.value(values[i]));
        }


    }
    @Test
    void testExponential() {
        int values[] = new int[] {-7, -2, 0, 24, 11};

        for(int i = 0; i < values.length; i++) {
            assertEquals((int)Math.exp(values[i]), Exponential.value(values[i]));
        }

    }
    @Test
    void testAddExact() {

        long values[][] = new long[][] {{-200l, 2l}, {0, -350l},{432l, 53l}, {44l, -24l}, {9223372036854774808l, 9223372036854775708l}};

        for(int i = 0; i < values.length; i++) {
            if(i < 4) {
                assertEquals(Math.addExact(values[i][0], values[i][1]), (long)AddExact.values(values[i][0], values[i][1]));
            } else {
                assertEquals("long overflow", (String) AddExact.values(values[i][0], values[i][1]));
            }
        }

    }
    @Test
    void testMax() {
        int values[][] = new int[][] {{-20, 5}, {0, 0},{-2, -2}, {50, 9}, {0, 20}};

        for(int i = 0; i < values.length; i++) {
            assertEquals(Math.max(values[i][0], values[i][1]), Max.values(values[i][0], values[i][1]));
        }

    }
}
