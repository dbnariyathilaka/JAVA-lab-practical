package com.mycompany.shapeobj;
public class Rectangle implements shape
{
    private float width,length;
    
    public Rectangle(float width,float length)
    {
        this.width=width;
        this.length=length;
    }
    public void setValues(float width)
    {
        this.width=width;
    }
    public void setLength(float length)
    {
        this.length=length;
    }
    public float getLength()
    {
        return length;
    }
    public float getWidth()
    {
        return width;
    }
    @Override
    public double calculateArea()
            {
                return width*length;
            }
    @Override
    public double calculatePerimeter()
    {
        return (2*width)+(2*length);
    }
}
