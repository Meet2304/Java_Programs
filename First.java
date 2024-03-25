package Java;
import java.util.*;
class FirstJavaExample{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Please enter your favourite number ");
        int number = sc.nextInt();
        System.out.println("Welcome to the world of Java, " + name);
        System.out.println("Your lucky number is "+ number);
    }
}