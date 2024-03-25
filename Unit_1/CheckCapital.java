import java.util.*;
public class CheckCapital {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++){
            if (Character.isUpperCase(words[i].charAt(0))){
                count++;
            }
        }
        System.out.println("The no of words in string is:" + words.length);
        System.out.println("The no of words starting with capital letters in string is:" + count);

        }
}
