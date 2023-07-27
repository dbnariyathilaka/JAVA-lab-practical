package com.mycompany.calareaobj;

public class CalAreaObj
{

    public static void main(String[] args) 
    {
        Circle c1=new Circle(7.00f);
        c1.calculateArea();
        c1.display();
        
        
        Rectangle r1=new Rectangle(10.00f,7.00f);
        r1.calculateArea();
        r1.display();
    }
}
