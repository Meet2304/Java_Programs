package Practicals_Practice;
import java.util.*;

public class c_SortAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in list: ");
        int num = sc.nextInt();
        int List1[] = new int[100];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter a number: ");
            int element = sc.nextInt();
            List1[i] = element;
        }
        System.out.println("Initial array: ");
        for(int i=0 ; i<num ; i++)
        {
            System.out.println(" " + List1[i]);
        }
        for(int i=0;i<num;i++)
        {
            for(int j=i+1; j<num; j++)
            {
                if(List1[i]>List1[j])
                {
                    int temp = List1[i];
                    List1[i] = List1[j];
                    List1[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0 ; i<num ; i++)
        {
            System.out.println(" " + List1[i]);
        }
    }    
}
