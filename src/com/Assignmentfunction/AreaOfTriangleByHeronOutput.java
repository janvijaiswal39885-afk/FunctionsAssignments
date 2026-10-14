package com.Assignmentfunction;

public class AreaOfTriangleByHeron {
    public static void main(String[] args) {
        double area = getAreaByThreeSides(3, 4, 5);
        System.out.println("Area of triangle:" + area);
    }

    public static double getAreaByThreeSides(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Invalid triangle side lengths.");
        }
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}

