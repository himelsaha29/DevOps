package com.ecse437.project.math;

public class CelsiusToFahrenheit {

    public int convert(int a) {
        int constant1 = 32;
        int constant2 = 64;

        int fahrenheit = 0;
        int celsius = a;

        fahrenheit = (int) AddExact.values((long)(a*1.8), constant1);


        return fahrenheit;
    }
}

