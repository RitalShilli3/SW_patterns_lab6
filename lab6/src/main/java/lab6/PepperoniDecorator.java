package lab6;

public class PepperoniDecorator extends PizzaDecorator {
    
    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
    public double getCost() {
        return super.getCost() + 1.5;
    }
    public String getDescription() {
        return super.getDescription() + ", Pepperoni";
    }
}