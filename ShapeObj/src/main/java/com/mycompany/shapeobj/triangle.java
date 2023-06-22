package com.mycompany.shapeobj;
public class triangle implements shape
{
   private float height,base,side1,side2;
   
   public triangle(float height,float base,float side1,float side2)
   {
       this.height=height;
       this.base=base;
       this.side1=side1;
       this.side2=side2;
       
   }
   public void setHeight()
   {
      this.height=height;
   }
   public void setBase(float base)
   {
       this.base=base;
   }
   public float getHeight()
   {
       return height;
   }
   public float getBase()
   {
       return base;
   }
   public void setSide1(float side1)
   {
       this.side1=side1;
   }
   public void setSide2(float side2)
   {
       this.side2=side2;
   }
   public float getSide1()
   {
       return side1;
   }
   public float getSide2()
   {
       return side2;
   }
   @Override
   public double calculateArea()
   {
       return 0.5*height*base;
   }
   @Override
   public double calculatePerimeter()
   {
       return base+side1+side2;
   }
}
