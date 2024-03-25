package SEM_4.Prototype_Method.Vehicle;

import java.util.ArrayList;
import java.util.*;

public class PrototypePatternExample  {
    public static void main(String[] args) throws CloneNotSupportedException{
        // Vehicle a = new Vehicle();
        // a.InsertData();
        // List<String> list2 = new ArrayList<String>();
        // list2.add("car 1");
        // list2.add("car 2");
        // list2.add("car 3");
        // list2.add("car 4");
        // System.out.println(a.getvehicleList());
        // Vehicle b = new Vehicle(list2);
        // System.out.println(b.getvehicleList()); 

        Vehicle a = new Vehicle();
        a.InsertData();
        Vehicle b = (Vehicle) a.clone();
        System.out.println("A: " + a.getvehicleList());
        System.out.println("B: " + b.getvehicleList() );
    }   
}
