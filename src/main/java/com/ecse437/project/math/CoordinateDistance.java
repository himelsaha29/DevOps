package com.ecse437.project.math;

public class CoordinateDistance {
    /**
     * Calculates distance between 2 coordinate points
     * @param x1,x2,y1,y2 coordinate points
     * @return distance between the coordinates
     */
    public double value(double x1, double x2, double y1, double y2) {
        double difference_x = x2 - x1;
        double difference_y = y2 - y1;

        double intermediate = (double) (long) AddExact.values((long)(difference_x * difference_x),
                (long)(difference_y * difference_y));

        return (int) SquareRoot.value(intermediate);

    }
}
