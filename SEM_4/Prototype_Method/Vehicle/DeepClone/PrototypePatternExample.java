package SEM_4.Prototype_Method.Vehicle.DeepClone;

import java.util.ArrayList;
import java.util.List;  

public class PrototypePatternExample {
    public static void main(String[] args) throws CloneNotSupportedException{

        Vehicle a = new Vehicle();
        a.InsertData();
        Vehicle b = (Vehicle) a.clone();
        System.out.println("A: " + a.getvehicleList());
        System.out.println("B: " + b.getvehicleList());

        List<String> list = b.getvehicleList();
        list.add("Honda New Amaze");
        System.out.println("B: " + b.getvehicleList());

        b.getvehicleList().remove("Audi A4");
        System.out.println("B: " + list);
        System.out.println("A: " + a.getvehicleList());
        //b.modify();
    }   
}
