public class Percentage {
    public static void main(String[] args){
        int List1[] = new int[]{99,98,99,98,99,98};
        int sum=0;
        for (int i=0;i<6;i++){
            sum = sum + List1[i];
        }
        System.out.println("The percentage of six subjects is:" + (sum/6));
    }

}
