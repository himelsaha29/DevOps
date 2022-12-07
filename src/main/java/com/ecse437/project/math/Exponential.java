package com.ecse437.project.math;

public class Exponential {
    /**
     * Calculates Euclidean e raised to the power of input value
     * @param a value to raise Euclidean value e to
     * @return Euclidean e raised to the power of input value
     */
    public static double value(int a) {

        if(a < 0) {
            return 0;
        }

        double answer = 1;
        if (a == 0) return 1;

        for(int i = 0; i < a; i++) {
            answer = answer * 2.718281828;
        }

        return (int) answer;
    }
}
