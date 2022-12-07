package com.ecse437.project.math;

public class CelsiusToFahrenheit {
    /**
     * Converts celsius to fahrenheit
     * @param a value to be converted to fahrenheit
     * @return converted fahrenheit value
     */
    public int convert(int a) {

        return (int) (long)AddExact.values((long)(a*1.8), 32);
    }
}

