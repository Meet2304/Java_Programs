package SEM_4.Practice.Composite;

public class CompositeTest {
    public static void main(String[] args) {
        Composite Computer = new Composite("Computer");
        Composite Peripherals = new Composite("Peripherals");
        Composite Case = new Composite("Case");

        Leaf Monitor = new Leaf("Monitor", 200);
        Leaf Keyboard = new Leaf("Keyboard", 100);
        
        Leaf Motherboard = new Leaf("Motherboard", 400);
        Leaf Processor = new Leaf("Processor", 800);

        Peripherals.addComponent(Monitor);
        Peripherals.addComponent(Keyboard);

        Case.addComponent(Motherboard);
        Case.addComponent(Processor);

        Computer.addComponent(Peripherals);
        Computer.addComponent(Case);

        Computer.showPrice();
    }
}
