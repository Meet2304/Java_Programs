package SEM_4.Structural_Design_Pattern.Composite_Design_Pattern.Computer;

public class CompositeTest {
    public static void main(String[] args) {
        Component HD = new Leaf(4000, "Hard-drive");
        Component Mouse = new Leaf(500, "Mouse");
        Component Monitor = new Leaf(8000, "Monitor");
        Component RAM = new Leaf(2000, "RAM");
        Component CPU = new Leaf(10000, "CPU");
        
        Composite ph = new Composite("Peri");
        Composite Cabinet = new Composite("Cabinet");
        Composite mb = new Composite("Mother Board");
        Composite Computer = new Composite("Computer");

        mb.addComponent(CPU);
        mb.addComponent(RAM);

        ph.addComponent(Mouse);
        ph.addComponent(Monitor);

        Cabinet.addComponent(HD);
        Cabinet.addComponent(mb);

        Computer.addComponent(ph);
        Computer.addComponent(Cabinet);

        RAM.showPrice();
        ph.showPrice();

        Computer.showPrice();   
    }
}
