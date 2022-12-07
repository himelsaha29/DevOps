package com.ecse437.project.math;

public class Round {
    /**
     * Rounds to floating number to the nearest integer
     * @param a value which is to be rounded
     * @return rounded value of the input
     */
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
