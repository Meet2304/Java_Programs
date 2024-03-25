package SEM_4.Structural_Design_Pattern.Composite_Design_Pattern.Cusines;

public class Leaf implements Component{
    String ingredients;
    String title;

    Leaf(String t, String i)
    {
        this.ingredients=i;
        this.title=t;
    }

    @Override
    public void showIngredientsList() {
        System.out.println("Leaf->" + title + ": " + ingredients);
    }
    @Override
    public String getIngredients() {
        return ingredients;
    }


}
