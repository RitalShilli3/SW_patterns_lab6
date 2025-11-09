package lab6;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("----------- IN LAB TASK: ---------");

        Coffee espresso = new Espresso();
        espresso = new SugarDecorator(espresso);
        System.out.println(espresso.getDescription() + " = $" + espresso.cost());

        Coffee latte = new Latte();
        latte = new SugarDecorator(latte);
        System.out.println(latte.getDescription() + " = $" + latte.cost());
    
        // ----------------------------------------------------------------- lab assignment demo below
        System.out.println("----------- LAB ASSIGNMENT: ---------");

        Pizza pizza = new StuffedCrust();
        pizza = new CheeseDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);

        System.out.println("Order: " + pizza.getDescription());
        System.out.println("Total Price: $" + pizza.getCost());

    
    }
}