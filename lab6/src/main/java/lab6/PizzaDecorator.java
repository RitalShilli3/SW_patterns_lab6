package lab6;

public abstract class PizzaDecorator implements Pizza {
    
    protected Pizza decoratedPizza;
    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }
    public double getCost() {
        return decoratedPizza.getCost();
    }
    public String getDescription() {
        return decoratedPizza.getDescription();
    }
}
