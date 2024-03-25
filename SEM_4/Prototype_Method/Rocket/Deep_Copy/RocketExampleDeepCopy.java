package SEM_4.Prototype_Method.Rocket.Deep_Copy;

import java.util.List;

public class RocketExampleDeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rocket R1 = new Rocket();
        R1.InsertData();
        Rocket R2 = (Rocket) R1.clone();
        System.out.println("Rocket List 1: " + R1.getRocketList());
        System.out.println("Rocket List 2: " + R2.getRocketList());

        System.out.println("LISTS AFTER ADDING AN ELEMENT TO ROCKET LIST 2:");
        List<String> list = R2.getRocketList();
        list.add("SpaceX Falcon 9");
        //The Values of Rocket List 2 do not change showing that it is a deep copy
        System.out.println("Rocket List 1: " + R1.getRocketList());
        System.out.println("Rocket List 2: " + R2.getRocketList());
    }
}
