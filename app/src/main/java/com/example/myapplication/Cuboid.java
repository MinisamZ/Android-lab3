package com.example.myapplication;

public class Cuboid {
    private double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;//a
        this.width = width;//b
        this.height = height;//h
    }

    public double getSurfaceArea() {
        return 2 * (length * width
                + length * height
                + width * height);
    }

    public double getVolume() {
        return length * width * height;
    }

}
