package ENDSEM_Practice;

class MainThread extends Thread{
    public void run(){
        for(int i=500 ; i<750 ; i++){
            System.out.println("Main thread: " + i);
        }
    }
}

class Thread1 extends Thread{
    public void run(){
        for(int i=0 ; i<250 ; i++){
            System.out.println("Thread 1: " + i);
        }
    }
}

class Thread2 implements Runnable{
    public void run(){
        for ( int i=250 ; i<500 ; i++){
            System.out.println("Thread 2: " + i);
        }
    }
}


public class Threads_1 {
    public static void main(String[] args) {
        MainThread T1 = new MainThread();
        T1.start();
        Thread1 T2 = new Thread1();
        T2.start();
        Thread2 T3 = new Thread2();
        Thread T3_b = new Thread(T3);
        T3_b.start();
    }
}
