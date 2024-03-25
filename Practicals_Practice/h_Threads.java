package Practicals_Practice;

class ChildThread1 extends Thread{
    public ChildThread1(String name){
        super(name);    
    }
    public void run(){
        for(int i=0 ; i<=250 ; i++){
            System.out.println("CHILD THREAD 1 " + i + " " + this.getName());
        }
    }
}
class ChildThread2 implements Runnable{
    String name;
    public ChildThread2(String n){
        this.name = n;    
    }
    public void run(){
        for(int i=251 ; i<=500 ; i++){
            System.out.println("CHILD THREAD 2 " + i +" " + this.name);
        }
    }
}

public class h_Threads {
    public static void main(String[] args) {
        
        ChildThread1 cht1 = new ChildThread1("Meet1");
        ChildThread2 cht2 = new ChildThread2("Meet2");
        Thread t2 = new Thread(cht2);
        
        cht1.start();
        t2.start();
        for(int i=501 ; i<700 ; i++)
        {
            System.out.println("Main thread: " + i);
        }      
    }
}
