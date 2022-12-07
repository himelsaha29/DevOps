package com.ecse437.project.math;

public class CelsiusToFahrenheit {

    public int convert(int a) {

        return (int) AddExact.values((long)(a*1.8), 32);
    }
}

