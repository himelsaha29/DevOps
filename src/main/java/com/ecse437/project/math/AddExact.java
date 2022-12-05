package com.ecse437.project.math;

public class AddExact {

    public static long values(long a, long b) {
        long r = a + b;

        if (((a ^ r) & (b ^ r)) < 0) {
            throw new ArithmeticException("long overflow");
        }
        return r;
    }
}
