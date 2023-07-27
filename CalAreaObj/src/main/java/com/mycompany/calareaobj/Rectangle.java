
package com.mycompany.calareaobj;


public class Rectangle extends Shape
{
    private float height;
    private float width;
    
    public Rectangle(float width,float height)
    {
        this.height=height;
        this.width=width;
    }
    
    @Override
    public float calculateArea()
    {
        area=height*width;
        
        return area;
    }
}
