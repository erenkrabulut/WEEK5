package exc7;

public class EXC7 
{
    public static void main(String[] args) 
    {
        
        Fan f1 = new Fan();
        System.out.println(f1.tostring());
        Fan f2 = new Fan();
        f2.setSpeed(f2.FAST);
        f2.setOn(true);
        f2.setColour("green");
        f2.setRadius(10.0);
        System.out.println(f2.tostring());

    }
}
