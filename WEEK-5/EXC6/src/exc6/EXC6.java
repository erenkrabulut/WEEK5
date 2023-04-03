package exc6;

public class EXC6 
{
    public static void main(String[] args) 
    { 
        StopWatch t1 = new StopWatch();
        t1.start();
        System.out.println("Start Time : "+t1.getStartTime());
        for(int i = 0 ; i<10000; i++)
        {
         System.out.print("-");
        }
        System.out.println();
        t1.stop();
        System.out.println("Stop Time : "+t1.getStopTime());
        System.out.println("Elapsed Time : "+t1.getElapsedTime());

    }
}
