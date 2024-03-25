package ENDSEM_Practice;

public class NestedTry {
    public static void main(String[] args) {
        try{
            int a = args.length;
            int b = 42/a;
            System.out.println("A = " + a);
            try{
                if(a==1){
                    a = a/(a-a);
                }
                else if (a==2){
                    int c[] = {1, 2, 3};
                    c[a] = 99;
                }
            }catch(ArrayIndexOutOfBoundsException AIOBE){
                System.out.println("Array Index Out of Bounds Exception");
            }
        }catch(ArithmeticException AE){
            System.out.println("Divide by zero");
        }
    }
}
