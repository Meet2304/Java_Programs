package SEM_4.Structural_Design_Pattern.Composite_Design_Pattern.Cusines;

public class CompositeTest {
    public static void main(String[] args) {
        Component pasta = new Leaf("Pasta", "Pasta");
        Component salt = new Leaf("Salt", "Salt");
        Component parm = new Leaf("Parmesan Cheese", "Parmesan Cheese");
        Component olives = new Leaf("Olives", "Olives");
        Component garlic = new Leaf("Garlic", "Garlic");
        Component beans = new Leaf("Beans", "Beans");
        Component tacos = new Leaf("Tacos", "Tacos");
        Component tomatoes = new Leaf("Tomatoes", "Tomatoes");
        Component onions = new Leaf("Onions", "Onions");
        Component panner = new Leaf("Panner", "Panner");
        Component garammasala = new Leaf("Garam Masala", "Garam Masala");
        Component turmeric = new Leaf("Turmeric", "Turmeric");
        Component chilly = new Leaf("Chilly", "Chilly");
        Component foiegras = new Leaf("Foie Gras", "Foie Gras");
        Component snails = new Leaf("Snails", "Snails");


        Composite mex = new Composite("Mexican Cusine");
        Composite ind = new Composite("Indian Cusine");
        Composite ita = new Composite("Italian Cusine");
        Composite frn = new Composite("French Cusine");
        Composite cusines = new Composite("WORLD CUSINES");
        
        mex.addIngredient(tacos);
        mex.addIngredient(garlic);
        mex.addIngredient(tomatoes);
        mex.addIngredient(onions);
        mex.addIngredient(beans);
        mex.addIngredient(olives);

        ind.addIngredient(salt);
        ind.addIngredient(garlic);
        ind.addIngredient(panner);
        ind.addIngredient(tomatoes);
        ind.addIngredient(onions);
        ind.addIngredient(garammasala);
        ind.addIngredient(turmeric);
        ind.addIngredient(chilly);

        ita.addIngredient(pasta);
        ita.addIngredient(salt);
        ita.addIngredient(garlic);
        ita.addIngredient(olives);
        ita.addIngredient(parm);
        
        frn.addIngredient(foiegras);
        frn.addIngredient(snails);
        frn.addIngredient(garlic);
        frn.addIngredient(tomatoes); 
        
        cusines.addIngredient(mex);
        cusines.addIngredient(ind);
        cusines.addIngredient(ita);
        cusines.addIngredient(frn);

        cusines.showIngredientsList();
    }
}
