package Unit_3;

class ChildThread1 extends Thread{
    public void run(){
        for(int i=250; i <= 500; i++){
            System.out.println("Welcome from " + Thread.currentThread().getName() + " " + i);
        }
    }
}
class ChildThread2 implements Runnable {
    public void run(){
        for(int i=250; i <= 500; i++){
            System.out.println("Welcome from " + Thread.currentThread().getName() + " " + i);
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        ChildThread1 t1 = new ChildThread1();
        Thread.State cs = t1.getState();
        System.out.println("ChildThread1 state before start: " + cs);
        t1.setName("CHILDTHREAD1");
        t1.start();
        System.out.println("ChildThread1 state after start: " + cs);

        ChildThread2 c = new ChildThread2();
        Thread t2 = new Thread(c);
        t2.setName("CHILDTHREAD2");
        //t2.start();

        for (int i=250; i<=500;i++){
            System.out.println("Welcome from " + Thread.currentThread().getName() + " " + i);
        }
        }   
}
