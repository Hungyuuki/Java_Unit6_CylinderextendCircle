package com.company;

public class Cylinder extends Circle {
    private double height = 1.5;

    public Cylinder() {
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public double getVolume(){
        return super.getArea()* this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " height =" + height +
                " area = " + super.getArea() +
                " volume = " + getVolume() +
                '}';
    }
}
