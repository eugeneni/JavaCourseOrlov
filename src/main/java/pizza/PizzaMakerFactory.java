package pizza;

public interface PizzaMakerFactory {

    AbstractPizzaMaker getPizzaMaker(Button button);

}
