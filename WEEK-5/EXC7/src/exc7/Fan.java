package exc7;

public class Fan 
{
    final int  SLOW=1;
    final int  MEDİUM=2;
    final int  FAST=3;
    private int speed = SLOW;
    private boolean on ;
    private double radius ;
    String colour ;
    public Fan()
    {
        speed = SLOW;
        on = false;
        radius  = 5;
        colour = "blue";
    }
    void setSpeed(int v)
    {
        speed=v;
    }
    int getSpeed()
    {
        return speed;
    }
    void setOn(boolean off)
    {
        on = off;
    }
    boolean getOn()
    {
        return on;
    }
    void setRadius(double r)
    {
        radius = r;
    }
    double getRadius()
    {
        return radius;
    }
    void setColour(String c)
    {
        colour=c;
    }
    String getColour()
    {
        return colour;
    }
    String tostring()
    {
        if(on)
        {
            return String.format("The fan is on...\nThe speed is %d\nThe radius is %.2f\nThe colour is %s\n",speed,radius,colour);
        }
        else
        {
            return String.format("The fan is off...\nThe radius is %.2f\nThe colour is %s\n",radius,colour);
        }
    }
   
    

}
