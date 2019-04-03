package pizza;

public class CarbonaraMaker extends AbstractPizzaMaker {

    @Override
    protected String build() {
        return "Carbonara";
    }

    @Override
    protected void fillIngredients() {
        System.out.println("Добавили: бекон, сыр, яица, сливочный соус и чеснок.");
    }

    @Override
    protected void bake() {
        System.out.println("Выпекаем ...");
        try {
            Thread.sleep(20_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
