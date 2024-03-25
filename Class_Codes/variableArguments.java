public class variableArguments {
   // Variable argument function taking one fixed parameter sem and variable number of parameter String 
    public static void printNames(int sem, String... n){
    for(int i=0;i<n.length;i++){
        System.out.println(n[i]);
    }
   }
    public static int add(int... n){
    int sum=0;
    for(int i=0;i<n.length;i++){
        sum = sum + n[i];
    }
    return sum;
   }
public static void main(String[] args){
    System.out.println(add());
    System.out.println(add(2,3));
    System.out.println(add(2,3,4));
    printNames(3, "Student 1", "Student 2");
    printNames(3, "Student 1", "Student 2", "Student 3");
} 
}
