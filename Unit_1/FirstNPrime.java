import java.util.*;

public class FirstNPrime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int Num = sc.nextInt();
        int Count=0;
        for(int i=1;;i++){
            int Flag = 0;
            for(int j=1; j<=i ; j++){
                if(i%j==0){
                    Flag++; 
                }
            }
            if(Flag==2){
                Count++;    
                System.out.println(i);
                }
            if(Count==Num){
                break;
            }
        }
    }
}

