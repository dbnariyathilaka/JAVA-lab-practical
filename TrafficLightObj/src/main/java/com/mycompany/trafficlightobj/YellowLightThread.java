package com.mycompany.trafficlightobj;


public class YellowLightThread extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Yellow");
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
