import java.util.*;
class Time {
    int hours;
    int minutes;
    int seconds;
    static int count=0;
    // Default Constructor
    Time(){
        hours=0;
        minutes=0;
        seconds=0;
        count++;
    }    
    // Parametrized Constructor
    Time(int hour, int minute, int second){
        hours=hour;
        minutes=minute;
        seconds=second;
        count++;
    }
    //Copy Constructor
    public Time(Time t){
        //this(t.hours, t.minutes, t.seconds);
        hours=t.hours;
        minutes=t.minutes;
        seconds=t.seconds;
        count++;
    }
    public void printTimeDetails(){
        System.out.println("Hours: " + hours+"\t Minutes: "+minutes+"\t Seconds: "+seconds);
    }
    public void addTime(Time t1, Time t2){
        System.out.println("Hours: " + (t1.hours+t2.hours) +"\t Minutes: "+(t1.minutes+t2.minutes)+"\t Seconds: "+(t1.seconds+t2.seconds));
    }
    public void subtractTime(Time t1, Time t2){
        System.out.println("Hours: " + (t1.hours-t2.hours) +"\t Minutes: "+(t1.minutes-t2.minutes)+"\t Seconds: "+(t1.seconds-t2.seconds));
    }
    public static int countObjects(){
        return count;
    }
}
class ClassTest{
    public static void main(String[] args){
        Time t1 = new Time(12, 45, 32);
        Time t2 = new Time(02, 36, 21);
        Time t3 = new Time();
        //Time t4 = t1;
        // Copy Constructor
        //Copy Constructor implementation
        Time t4 = new Time(t1);
        t1.printTimeDetails();
        t2.printTimeDetails();
        t4.printTimeDetails();
        t3.addTime(t1,t2);
        t3.subtractTime(t1,t2);
        System.out.println("The number of objects is: "+Time.countObjects());
    }
}
