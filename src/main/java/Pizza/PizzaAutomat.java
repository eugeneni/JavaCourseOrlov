package Pizza;

public class PizzaAutomat {

    private final PizzaMakerFactory pizzaMakerFactory;

     PizzaAutomat(PizzaMakerFactory pizzaMakerFactory) {
        this.pizzaMakerFactory = pizzaMakerFactory;
    }

     String getPizza(Button button) {
        AbstractPizzaMaker maker = pizzaMakerFactory.getPizzaMaker(button);
        return maker.makePizza();
    }

    public static void main(String[] args) {
        PizzaAutomat automat = new PizzaAutomat(new UkrainMakerFactory());
        String pizza = automat.getPizza(Button.BUTTON_3);
        System.out.println("Сьели, ням-ням-ням " + pizza);

    }

}