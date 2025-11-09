package lab6;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    public double cost() {
        return super.cost() + 0.2;
    }
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
