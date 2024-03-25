import java.util.*;
public class CheckVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line:");
        String str = sc.nextLine();
        int Vowels=0;
        int Consonants=0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                Vowels = Vowels + 1;
            }
            else
            {
                Consonants = Consonants + 1;
            }
        }
        System.out.println("Vowels is:" + Vowels);
        System.out.println("Consonants is:" + Consonants);
    }
}
        
