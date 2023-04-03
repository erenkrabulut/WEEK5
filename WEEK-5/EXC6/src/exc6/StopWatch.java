package exc6;

import java.util.Date;
public class StopWatch {
    Date date = new Date();
    private long startTime ;
    private long endTime;
    public void start()
    {
        startTime = System.currentTimeMillis();
    }
    long getStartTime()
    {
        return startTime;
    }
    void stop()
    {
        endTime = System.currentTimeMillis();
    }
    long getStopTime()
    {
        return endTime;
    }
    long getElapsedTime()
    {
        return endTime-startTime;
    }
    

}
