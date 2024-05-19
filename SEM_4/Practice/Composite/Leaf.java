package SEM_4.Practice.Composite;

public class Leaf implements Component {
    String name;
    int price;

    public Leaf(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println("Leaf-> " + price);
    }

    @Override
    public int getPrice() {
        return price;
    }


}
