package ENDSEM_Practice;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("A = " + a);
            int b = 50/a;
            int c[] = {2,3, 3};
            c[a] = 99;
        }catch( ArithmeticException AE){
            System.out.println("Arithmatic Exception");
        }catch(ArrayIndexOutOfBoundsException AIOUBE){
            System.out.println("Array Index Out of Bounds Exception");
        }
        System.out.println("After Try catch Blocks");
    }
}
