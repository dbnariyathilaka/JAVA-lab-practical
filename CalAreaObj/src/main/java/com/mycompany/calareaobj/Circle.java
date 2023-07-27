
package com.mycompany.calareaobj;

public class Circle extends Shape
{
    private float radius;
    
    public Circle(float radius)
    {
        this.radius=radius;
        
    }
    
    @Override
    public float calculateArea()
    {
        area=(float) ((3.14)*radius*radius);
        
        return area;
    }
}
