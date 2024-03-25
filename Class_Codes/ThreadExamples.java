class Thread1 extends Thread{
    public void run(){
        for(int i=1; i<251;i++){
            System.out.println("Welocome: " + i);
        }
    }
}

class Thread2 extends Thread{
    Thread t;
    Thread2(Thread t){
        this.t = t;
    }
    public void run(){
        try{
            t.join();
            for(int i=251; i<500;i++){
            System.out.println("Welocome: " + i);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
public class ThreadExamples {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2(t1);

        t1.start();
        t2.start();
    }
}
