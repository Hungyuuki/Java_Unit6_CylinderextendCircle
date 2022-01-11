package com.company;

public class Main {

    public static void main(String[] args) {
//        test circle
	Circle circle = new Circle();
        System.out.println(circle);

//        test cylinder
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder.setHeight(3);
        System.out.println(cylinder);
    }
}
