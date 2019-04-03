package Pizza;

public class ForeCheeseMaker extends AbstractPizzaMaker {

    @Override
    protected String build() {
        return "ForeCheese";
    }

    @Override
    protected void fillIngredients() {
        System.out.println("Добавили: моцарелла, сливочный, дорблю, орехи");
    }

    @Override
    protected void bake() {
        System.out.println("Выпекаем ...");
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}