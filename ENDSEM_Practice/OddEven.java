package ENDSEM_Practice;

public class OddEven {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Thread Even = new Even("even", resource);
        Thread Odd = new Thread(new Odd("odd", resource));
        Even.start();
        Odd.start();
    }
}

class Resource{
    Boolean isexecuted = false;
    int data;

    synchronized void produce(int num) throws Exception{
        if(isexecuted){
            wait();
        }
        data = num;
        isexecuted = true;
        notifyAll();
    }

    synchronized int consume() throws Exception{
        if(!isexecuted){
            wait();
        }
        isexecuted = false;
        notifyAll();
        return data;
    }
}

class Even extends Thread{
    String name;
    Resource res;

    public Even(String n, Resource r){
        this.name = n;
        this.res = r;
    }
    public void run(){
        try{
            for(int i=0 ; i<20 ; i = i+2){
                res.produce(i);
                System.out.println("Even: " + i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Even Numbers Printed");
        }
    }
}

class Odd implements Runnable{
    String name;
    Resource res;

    public Odd(String n, Resource r){
        this.name = n;
        this.res = r;
    }
    public void run(){
        try{
            for( int i = 1 ; i<20 ; i=i+2){
                int consumedvalue = res.consume() + 1;
                res.consume();
                System.out.println("Odd: " + consumedvalue);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Odd Numbers Printed");
        }
    }
}