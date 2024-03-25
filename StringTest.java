import java.util.*;
public class StringTest{
    public static void main(String args[]){
        String name1 = "Java Programming";
        String name2 = "Java Programming";
        String name3 = new String("Java Programming");
	
	if(name1==name2)
		System.out.println(name1 + "\t" + name2 + " equal ");
	if(name1==name3)
		System.out.println(name1 + "\t" + name3 + " equal ");
	else
		System.out.println(name1 + "\t" + name3 + " not equal ");
	if(name1.equals(name3))
		System.out.println(name1 + "\t" + name3 + " equal ");

        int len = name1.length();
        System.out.println("Length of : " + name1 + " is " + len);
    }
}