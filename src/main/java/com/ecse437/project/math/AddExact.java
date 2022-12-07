package com.ecse437.project.math;

public class AddExact {
    /**
     * Returns addition of 2 inputs considering variable overflow
     * @param a,b two values to be added
     * @return summation of 2 input values, String in case of variable overflow
     */
    public static Object values(long a, long b) {
        long r = a + b;

        if (((a ^ r) & (b ^ r)) < 0) {
            return "long overflow";
        }
        return r;
    }
}
