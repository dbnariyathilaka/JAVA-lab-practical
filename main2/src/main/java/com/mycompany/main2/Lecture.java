
package com.mycompany.main2;


public class Lecture implements Speaker
{
    @Override
    public void speak(String phrase)
    {
        System.out.println("Lecture: "+phrase);
    }
    
}
