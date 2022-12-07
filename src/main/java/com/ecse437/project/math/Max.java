package com.ecse437.project.math;

public class Max {
    /**
     * Finds max between two values
     * @param a,b values for which max is to be determined
     * @return Max of input values a and b
     */
    public static int values(int a, int b) {
        if(a < b){
            return b;
        }
        else{
            return a;
        }
    }
}
