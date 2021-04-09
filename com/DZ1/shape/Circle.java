package com.DZ1.shape;


public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle clone()
    {
        Circle circle = new Circle();
        circle.radius = this.radius;
        return circle;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle getRadius() {
        return clone();
    }


    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius= " + radius +" "+
                "color= '" + color + '\'' +
                '}';
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    private static int per=8;

    public static int getper(){
        return per;
    }
}
