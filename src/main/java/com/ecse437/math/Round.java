package com.ecse437.math;

public class Round {

    public static int value(float a) {
        
        int decimal = (int) a;
        float fractional = a - decimal;
        if (fractional < 0.5){
            return decimal;
        }
        else{
            return decimal + 1;
        }
    }
}
