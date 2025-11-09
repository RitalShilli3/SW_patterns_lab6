package lab6;

public class CheeseDecorator extends PizzaDecorator {
    
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
    public double getCost() {
        return super.getCost() + 1.0;
    }
    public String getDescription() {
        return super.getDescription() + ", Extra Cheese";
    }
}
