package week_09.week_09_Classes;

public class Question_09_06_StopWatch {
    private long startTime ;

    private long endTime ;

   public Question_09_06_StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public void start(){
       startTime = System.currentTimeMillis();
    }
    public void stop(){
       endTime = System.currentTimeMillis();
    }
    public long getStartTime(){
       return startTime;
    }
    public long getEndTime(){
       return endTime;
    }
    public long getElapsedTime(){
       return endTime-startTime;
    }
}
