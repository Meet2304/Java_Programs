/*
 * WAP to create two threads. Odd thread print odd number and even thread prints even number. Ouput must be generated sequentially 1,2,3,4....
 * (Use: wait and notify - inter Thread COmmunication API) 
 */

package Unit_3;

class NumberPrinting{
    
    boolean isOdd = false;

    public synchronized void printOdd(int i){
        while(isOdd){
            try{
                wait();
            }catch(Exception e){

            }
        }
        isOdd = true;
        System.out.println("Odd: " + i);
        notify();
    }
    public synchronized void printEven(int i){
        while(!isOdd){
            try{
                wait();
            }catch(Exception e){}
        }
        isOdd = false;
        System.out.println("Even: " + i);
        notify();
    }
}
class OddThread extends Thread{
    NumberPrinting n;
    OddThread(NumberPrinting n1){
        n = n1;
    }
    public void run(){
        for(int i=1; i<=20; i = i+2){
            n.printOdd(i);
            try{
                Thread.sleep(500);
            }catch(Exception e){

            }
        }
    }
}
class EvenThread extends Thread{
    NumberPrinting n;
    EvenThread(NumberPrinting n1){
        n = n1;
    }
    public void run(){
        for(int i=2; i<=20; i = i+2){
            n.printEven(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }
}

class ITCTest{
    public static void main(String[] args) {
        NumberPrinting n1 = new NumberPrinting();
        OddThread o1 = new OddThread(n1);
        EvenThread e1 = new EvenThread(n1);
        o1.start();
        e1.start();
    }
}
public class InterThreadCommunication {

}
