package com.mycompany.trafficlightobj;


public class RedLightThread extends Thread 
{
    public void run()
    {
        while(true)
        {
            System.out.println("Red");
            try
            {
                Thread.sleep(5000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
