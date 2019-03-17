package Pizza;

public class UkrainMakerFactory implements PizzaMakerFactory {

    @Override
    public AbstractPizzaMaker getPizzaMaker(Button button) {
        switch(button) {
            case BUTTON_1:
                return new CarbonaraMaker();
            case BUTTON_2:
                return new ForeCheeseMaker();
            case BUTTON_3:
                return new PapperonyMaker();
            case BUTTON_4:
                return new PolloMaker();
        }
        throw new IllegalStateException();
    }
}
