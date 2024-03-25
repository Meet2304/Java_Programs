import java.util.*;
public class SortAsc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of elements in list:");
        int num = sc.nextInt();
        int List1[]= new int[100];
        for (int i=0;i<num;i++){
            System.out.println("Enter the element:");
            List1[i]=sc.nextInt();
        }
        
        for (int i=0;i<num;i++){
            for(int j=0;j<i;j++){
                int temp=0;
                if (List1[i]<List1[j]){
                    temp=List1[i];
                    List1[i]=List1[j];
                    List1[j]=temp;
                }
            }
        }
        for( int i=0; i<num; i++){
            System.out.println(List1[i]);
        }

    }
}
