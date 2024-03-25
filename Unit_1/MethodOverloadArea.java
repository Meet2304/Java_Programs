import java.util.*;
public class MethodOverloadArea {
    static int area( int s){
        return s*s; 
    }
    
    static float area( float rl, float rb){
        return rl*rb; 
    }
    
    static double area( double th, double tb){
        return th*tb/2; 
    }

    static float area( float sr){
        return (3.14f*sr*sr); 
    }
    public static void main(String[] args){
        
        int s=5;
        float rl=10f;
        float rb=5f;
        double tb=15;
        double th=10;
        float sr=20f;
        int area1 = area(s);
        System.out.println(area1);
        float area2 = area(rl,rb);
        System.out.println(area2);
        double area3 = area(th,tb);
        System.out.println(area1);
        float area4 = area(sr);
        System.out.println(area4);   
    }
}
