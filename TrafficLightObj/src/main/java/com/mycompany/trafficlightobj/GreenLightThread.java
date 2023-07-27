
package com.mycompany.trafficlightobj;


public class GreenLightThread extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Green");
            try
            {
                Thread.sleep(10000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
