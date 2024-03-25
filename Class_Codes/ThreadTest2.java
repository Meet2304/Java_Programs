import java.util.*;

class ChildThread1 extends Thread{
    /*
     * Task to be executed by thread..Override run method of thread class
     */
    public void run(){
        for(int i=1; i<=50; i++){
            System.out.println("Welcome from: " + Thread.currentThread().getName() + " " + i);
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        System.out.println("Threading Test Example!!");
        ChildThread1 thread1 = new ChildThread1();
        thread1.setName("ChildThread1");
        thread1.start(); // State changes from new to runnable
        for(int i=51; i<=100; i++){
            System.out.println("Greetings from: " + Thread.currentThread().getName() + " " + i);
        }
    }
}
