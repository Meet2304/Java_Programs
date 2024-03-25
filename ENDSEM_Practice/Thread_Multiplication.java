package ENDSEM_Practice;

class ChildThread1 extends Thread{
    int n1;
    public ChildThread1(int n){
        this.n1 = n;
    }
    public void run(){
        for( int i=0 ; i<n1 ; i++){
            System.out.println(n1 + " * " + i + " = " + n1*i);
            try{
                ChildThread1.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class ChildThread2 implements Runnable{
    int n2;
    Thread th;
    public ChildThread2(int n, Thread t){
        this.n2 = n;
        this.th = t;
    }
    public void run(){
        try{
            th.join();
        }catch(Exception e){
            System.out.println(e);
        }
        for( int i = 0 ; i<n2 ; i++){
            System.out.println(n2 + " * " + i + " = " + n2*i);
        }
    }
}

class MainThread implements Runnable{
    int n3;
    Thread th;
    public MainThread(int n, Thread t){
        this.n3 = n;
        this.th = t;
    }
    public void run(){
        try{
            th.join();
        }catch(Exception e){
            System.out.println(e);
        }
        for( int i = 0 ; i<n3 ; i++){
            System.out.println(n3 + " * " + i + " = " + n3*i);
        }
    }
}

public class Thread_Multiplication {
    public static void main(String[] args) {
        ChildThread1 t1 = new ChildThread1(5);
        t1.start();
        ChildThread2 t2 = new ChildThread2(6, t1);
        Thread t2_b = new Thread(t2);
        t2_b.start();
        MainThread t3 = new MainThread(7, t2_b);
        Thread t3_b = new Thread(t3);
        t3_b.start();
    }
}
