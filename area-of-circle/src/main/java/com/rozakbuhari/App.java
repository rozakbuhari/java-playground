package com.rozakbuhari;

public class App
{
    public static void main( String[] args )
    {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(6);

        System.out.println("Radius of c1 is " + c1.getRadius());
        System.out.println("Area of c1 is " + c1.getArea());
        System.out.println("Radius of c2 is " + c2.getRadius());
        System.out.println("Area of c2 is " + c2.getArea());
    }
}
