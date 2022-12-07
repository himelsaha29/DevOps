package com.ecse437.project.math;

public class LogBase10 {

    public static double value(double a) {

        double answer = Math.log(a) / Math.log(10);
        return (int)answer;
    }
}
