package SEM_4.Practice.Composite;
import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name)
    {
        super();
        this.name = name;
    }

    public void addComponent(Component comp)
    {
        this.components.add(comp);
    }

    @Override
    public void showPrice() {
        System.out.println("Composite: " + name + " Price: " + getPrice());
        System.out.println("Leaves of: " + name);
        for (Component c : components)
        {
            c.showPrice();
        }

    }
    @Override
    public int getPrice() {
        int p=0;
        for (Component c : components)
        {
            p+=c.getPrice();
        }
        return p;
    }
}
