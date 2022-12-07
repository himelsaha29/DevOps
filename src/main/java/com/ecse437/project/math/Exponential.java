package com.ecse437.project.math;

public class Exponential {

    public static double value(int a) {
        double answer = 1;
        if (a == 0) return 1;

        for(int i = 0; i < a; i++) {
            answer = answer * 2.718281828;
        }

        return (int) answer;
    }
}
