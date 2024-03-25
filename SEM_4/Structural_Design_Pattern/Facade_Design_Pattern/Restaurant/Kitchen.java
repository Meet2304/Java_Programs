package SEM_4.Structural_Design_Pattern.Facade_Design_Pattern.Restaurant;

public class Kitchen {
    public void prepareOrder(String item, int Quantity)
    {
        System.out.println("Prepare order: " + item + "| Quantity: " + Quantity);
    }

    public void displayavailableTables()
    {
            System.out.println("The number of available tables.");
    }
}
