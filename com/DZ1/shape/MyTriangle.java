package com.DZ1.shape;

import com.DZ1.shape.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                '}';
    }

    public double getPerimeter(){
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v3.distance(v2);
        return a+b+c;
    }

    public  String getType(){
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v3.distance(v2);
        if(a==b && a==c)
            return "Equilateral";
        else if(a==b && a!=c || a==c && a!=b || b==c && b!=a)
            return "isosceles";
        else
            return "scalene";
    }
}
