package com.ecse437.project.math;

public class LogBase10 {
    /**
     * Calculates log base 10 of input value
     * @param a value for which log base 10 is to be calculated
     * @return log base 10 of the input
     */
    public static double value(double a) {

        if (a < 0 || a == Double.NaN) return (int)Double.NaN;
        else if(a == 0) return (int) Double.NEGATIVE_INFINITY;

        double answer = Math.log(a) / Math.log(10);
        return (int)answer;
    }
}
