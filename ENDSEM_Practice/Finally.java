package ENDSEM_Practice;

public class Finally {
    static void ProcA(){
        try{
            System.out.println("inside ProcA");
            throw new RuntimeException();
        }finally{
            System.out.println("ProcA's finally");
        }
    }
    static void ProcB(){
        try{
            System.out.println("inside ProcB");
            return;
        }finally{
            System.out.println("ProcB's finally");
        }
    }
    static void ProcC(){
        try{
            System.out.println("inside ProcC");
        }finally{
            System.out.println("ProcC's finally");
        }
    } 
    public static void main(String[] args) {
        try{
            ProcA();
        }catch(Exception E){
            System.out.println("Exception Caught");
        }
        ProcB();
        ProcC();
        //ProcA();
    }  
}
