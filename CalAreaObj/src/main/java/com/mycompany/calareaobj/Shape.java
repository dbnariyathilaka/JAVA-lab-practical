
package com.mycompany.calareaobj;


abstract class Shape 
{
    protected float area;
    
    
    public abstract float calculateArea();
    
    public void display()
    {
        System.out.println("Area is :"+area);
    }
    
    
    
}
