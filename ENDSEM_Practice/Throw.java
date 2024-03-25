package ENDSEM_Practice;

public class Throw {
    static void demoproc(){
        try{
            throw new NullPointerException("demo");
        }catch(NullPointerException NPE){
            System.out.println("Caught inside demoproc");
            throw NPE;
        }
    }
    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException NPE){
            System.out.println("Recaught");
        }
    }
}
