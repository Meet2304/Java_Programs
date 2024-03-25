package SEM_4.Structural_Design_Pattern.Composite_Design_Pattern.Restaurant;

public class Leaf implements Component{
    int price;
    String name;

    Leaf(int p, String n)
    {
        this.price = p;
        this.name = n;
    }

    @Override
    public void showPrice() {
        System.out.println("Leaf -> " + name + ": " + price);
    }
    @Override
    public int getPrice() {
        return price;
    }
}
