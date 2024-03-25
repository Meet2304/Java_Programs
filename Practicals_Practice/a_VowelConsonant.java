package Practicals_Practice;
import java.util.*;

public class a_VowelConsonant {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int Vowels = 0;
        int Consonants = 0;
        for(int i=0; i<str.length();i++ )
        {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                Vowels++;
            }
            else
            {
                Consonants++;
            }
        }
        System.out.println("The number of vowels is: " + Vowels);
        System.out.println("The number of Consonants is: " + Consonants);
    }

}
