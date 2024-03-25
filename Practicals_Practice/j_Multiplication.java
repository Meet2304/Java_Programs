package Practicals_Practice;

class ChildThread1 extends Thread{
    int n;
    public ChildThread1(int n){
        this.n = n;
    }
    public void run(){
        for(int i=0 ; i<10 ; i++){
            System.out.println(n+" * " + i + " = " + n*i);
        }
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class ChildThread2 extends Thread{
    int n2;
    Thread t2;
    public ChildThread2(Thread t, int i){
        this.t2 = t;
        this.n2 = i;
    }
    public void run(){
        for(int i=0 ; i<10 ; i++){
            System.out.println(n2+" * " + i + " = " + n2*i);
        }
        try{
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

public class j_Multiplication {
    public static void main(String[] args) {
        ChildThread1 t1 = new ChildThread1(5);
        ChildThread2 t2 = new ChildThread2(t1, 10);
        t1.start();
        t2.start();
    }
}
