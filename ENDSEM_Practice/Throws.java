package ENDSEM_Practice;

public class Throws {
    static void ThrowOne() throws IllegalAccessException{
        System.out.println("Inside ThrowOne");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) {
        try{
            ThrowOne();
        }catch(IllegalAccessException IAE){
            System.out.println("CAUGHT");
        }
    }
}
