package com.mycompany.shapeobj;
public class Circle implements shape
{
    private float radius;
    
            public Circle(float radius)
            {
                this.radius=radius;
            }
            public void setRadius(float radius)
            {
                this.radius=radius;
            }
            public float getRadius()
            {
                return radius;
            }
            @Override
            public double calculateArea()
            {
                return 3.14*radius*radius;
            }
            @Override
            public double calculatePerimeter()
            {
                return 2*3.14*radius;
            }
}
