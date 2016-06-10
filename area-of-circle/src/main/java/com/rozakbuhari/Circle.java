package com.rozakbuhari;

import java.lang.Math;

public class Circle {
    private double area;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }
}
