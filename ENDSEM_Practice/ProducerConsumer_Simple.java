package ENDSEM_Practice;

public class ProducerConsumer_Simple {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Thread producer1 = new Producer("producer1", resource);
        Thread consumer1 = new Thread(new Consumer("consumer1", resource));
        producer1.start();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        consumer1.start();
    }
}

class Resource{
    Boolean isproduced = false;
    int data;

    synchronized void produce(int num) throws Exception{
        while(isproduced){
            wait();
        }
        this.data = num;
        isproduced = true;
        notifyAll();
    }

    synchronized int consume() throws Exception{
        while(!isproduced){
            wait();
        }
        isproduced = false;
        notifyAll();
        return data;
    }
}

class Producer extends Thread{
    String name;
    Resource res;

    public Producer(String n, Resource r){
        this.name = n;
        this.res = r;
    }

    public void run(){
        try{
            for(int i = 0 ; i<10 ; i++){
                res.produce(i);
                System.out.println("Produced: " + i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Producer finished the job");
        }
    }
}

class Consumer implements Runnable{
    Resource res;
    String name;
     
    public Consumer(String n, Resource r){
        this.name = n;
        this.res = r;
    }

    public void run(){
        try{
            for( int i=0 ; i<10 ; i++){
                System.out.println("consumed: " + res.consume());
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Consumer finished the job");
        }
    }
}
