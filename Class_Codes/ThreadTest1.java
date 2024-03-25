import java.util.*;
class ThreadTest1 {
    // Thread Properties printing
    public static void main(String[] args) {
        System.out.println("Thread testing Exaxmple!");
        System.out.println("Id : " + Thread.currentThread().getId());//Returns reference of the thread which is being currently executed
        System.out.println("Name : " + Thread.currentThread().getName());
        System.out.println("Priority Value(0 to 10) : " + Thread.currentThread().getPriority());
        System.out.println("Status Alive? : " + Thread.currentThread().isAlive());
        System.out.println("Background Thread? : " + Thread.currentThread().isDaemon());//Returns Boolean value showing if the thread is a background thread(eg:Spell Checker) or foreground thread(eg:word Processor)
    }    
}
