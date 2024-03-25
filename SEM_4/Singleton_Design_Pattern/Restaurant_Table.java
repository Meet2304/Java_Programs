package SEM_4.Singleton_Design_Pattern;

public class Restaurant_Table {
    private static Restaurant_Table Table1 = new Restaurant_Table();
    public int seatcapacity;

    // Private Constructor
    private Restaurant_Table()
    {
        System.out.println("Restaurant Table Created..");
    }

    // Gloabal Access Point
    public static Restaurant_Table getTable()
    {
        return Table1;
    }

    // Getter Methods
    public int getTableCapacity()
    {
        return seatcapacity;
    }

    // Setter Methods
    public void setTable(int cap)
    {
        this.seatcapacity = cap;
    }    
}

class TestClass
{
    public static void main(String[] args) {
        Restaurant_Table T1 = Restaurant_Table.getTable();
        Restaurant_Table T2 = Restaurant_Table.getTable();

        T1.setTable(5);
        T2.setTable(3);
        System.out.println("Seating For customer 1 on Table 1: " + T1.getTableCapacity());

        T2.seatcapacity = T1.seatcapacity + T2.seatcapacity;
        System.out.println("Seating For Customer 2 on Table 2: " + T2.getTableCapacity());

        print("Customer 1 ", T1);
        print("Customer 2 ", T2);
    }

    static void print(String name, Restaurant_Table R1)
    {
        System.out.println(String.format("Object: %s, Hashcode: %d, Value: %d", name, R1.hashCode(), R1.getTableCapacity()));
    }
}

