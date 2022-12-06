package com.ecse437.project.math;

public class SquareRoot {

    public static double value(double a) {

        double lo = Math.min(1, a), hi = Math.max(1, a), mid = 0;

        while(100 * lo * lo < a) lo *= 10;
        while(0.01 * hi * hi > a) hi *= 0.1;

        for(int i = 0 ; i < 100 ; i++){
            mid = (lo+hi)/2;
            if(mid*mid == a) return mid;
            if(mid*mid > a) hi = mid;
            else lo = mid;
        }
        return mid;
    }
}
