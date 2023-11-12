package week_10.Classes;

import java.util.GregorianCalendar;

public class MyDate {
    private int year ;
    private int month ;
    private int day ;

    public MyDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(System.currentTimeMillis());
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_WEEK);
    }
    public MyDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_WEEK);
    }
    public MyDate(int year , int month , int day){
        this.year = year;
        this.month = month;
        this.day = day;

    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void setDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_WEEK);

    }
    @Override
    public String toString(){
        return this.day + "/" + (this.month + 1) + "/" + this.year;
    }

}
