package SEM_4.Practice.Decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public Double getCost() {
        return 120.0;
    }
    
}
