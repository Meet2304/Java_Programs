package SEM_4.Structural_Design_Pattern.Composite_Design_Pattern.Cusines;
import java.util.*;

public class Composite implements Component {
    List<Component> components = new ArrayList<>();
    String title;

    public Composite(String n)
    {
        super();
        this.title = n;
    }

    public void addIngredient(Component in)
    {
        components.add(in);
    }

    @Override
    public void showIngredientsList() {
        System.out.println("Composite-> " + title + " Ingredients: " + getIngredients());
        System.out.println("Leaf of " + title);
        for(Component c : components )
        {
            c.showIngredientsList();
        }
    }

    @Override
    public String getIngredients() {
        StringBuilder ingredients = new StringBuilder();
        for(Component c : components)
        {
            ingredients.append(c.getIngredients()).append(", ");
        }
        return ingredients.toString();
    }
    
}
