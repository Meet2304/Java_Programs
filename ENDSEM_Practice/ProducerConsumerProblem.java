package ENDSEM_Practice;

import java.util.LinkedList;;

class Buffer{
    private LinkedList<Integer> Buffer;
    private int capacity;

    public Buffer(int cap){
        this.Buffer = new LinkedList<>();
        this.capacity = cap;
    }

    public void produce(int item){
        synchronized(this){
            while(Buffer.size() == capacity){
                try{
                    wait(); //Wait if the buffer si full
                }catch(InterruptedException ie){
                    Thread.currentThread().interrupt();
                }
            }
            Buffer.add(item);
            System.out.println("Produced: " + item);
            notifyAll(); // Notify all consumers that an item is available
        }
    }

    public void consume(){
        synchronized(this){
            while(Buffer.isEmpty()){
                try{
                    wait(); //Wait if the buffer is empty
                }catch(InterruptedException ie){
                    Thread.currentThread().interrupt();
                }
                int item = Buffer.remove();
                System.out.println("Consumed: " + item);
                notifyAll();
            }
        }
    }

    class Producer implements Runnable{
        private Buffer buffer;

        public Producer(Buffer b){
            this.buffer = b;
        }
        public void run(){
            for( int i=0 ; i<10 ; i++){
                buffer.produce(i);
                try{
                    Thread.sleep((int)(Math.random() * 1000 ));
                }catch(InterruptedException ie){
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    class Consumer implements Runnable{
        private Buffer buffer;
        public Consumer(Buffer b){
            this.buffer = b;
        }
        public void run(){
            for( int i=0 ; i<10 ; i++){
                buffer.consume();
                try{
                    Thread.sleep((int)(Math.random() * 1000));
                }catch(InterruptedException ie){
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    class ProducerConsumerDuo{

        public static void main(String[] args) {
            Buffer buffer = new Buffer(5);
            Thread producerThread = new Thread(new Producer(buffer));
            Thread consumerThread = new Thread(new Consumer(buffer));
            producerThread.start();
            consumerThread.start();
        }
    }
}

public class ProducerConsumerProblem {
    
}
