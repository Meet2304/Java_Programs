package Practicals_Practice;

import java.util.Scanner;

public class b_CapitalLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        String [] words = str.split(" ");
        int count = 0;
        for (int i = 0; i<words.length;i++)
        {
            if(Character.isUpperCase(words[i].charAt(0)))
            {
                count++;
            }
        }
        System.out.println("The number of words is: " + words.length);
        System.out.println("The number of words starting with capital letters is: " + count);
    }
}
