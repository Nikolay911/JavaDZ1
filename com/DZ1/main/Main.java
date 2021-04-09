package com.DZ1.main;

import com.DZ1.abe.Author;
import com.DZ1.abe.Book;
import com.DZ1.abe.Employee;
import com.DZ1.shape.Circle;
import com.DZ1.shape.MyPoint;
import com.DZ1.shape.MyTriangle;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(1, "Wee", "Woo", 100);
        System.out.println(employee.toString());

        employee.raiseSalary(15);
        System.out.println(employee.toString());



        //------------ TEST FOR CLASS BOOK AND AUTHOR--------------------------------------------------

        System.out.println("//------------ TEST FOR CLASS BOOK AND AUTHOR--------------------------------------------------");
        int kolAutors = 2;
        Author[] authors =new Author[kolAutors];

        authors[0] = new Author("au1", "au1@gmail.com",'M');
        authors[1] = new Author("au2", "au2@gmail.com",'W');


        Book book = new Book("Book Name",authors,21.5);
        System.out.println("Authors names: " + book.getAuthorName(kolAutors));

        System.out.println(book.toString(kolAutors));

        //------------ TEST FOR CLASS MYPOINT AND MYTIANGLE--------------------------------------------------

        System.out.println("//------------ TEST FOR CLASS MYPOINT AND MYTIANGLE--------------------------------------------------");

        MyPoint myPoint1 = new MyPoint(1,0);
        MyPoint myPoint2 = new MyPoint();
        MyPoint myPoint3 = new MyPoint(0,1);


        MyTriangle myTriangle = new MyTriangle(myPoint1, myPoint2, myPoint3);
        System.out.println(myTriangle.toString());
        System.out.println(myTriangle.getType());
        System.out.println(myTriangle.getPerimeter());



        Circle c1 = new Circle(5);
        Circle c2 =c1.clone();
        c2.setRadius(1);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        int a=Circle.getper();
        //c1.getper()=9;
        System.out.println(c1.getper());
        System.out.println(c2.getper());
    }

}
