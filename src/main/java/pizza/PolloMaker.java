package pizza;

public class PolloMaker extends AbstractPizzaMaker {

    @Override
    protected String build() {
        return "PolloMaker";
    }

    @Override
    protected void fillIngredients() {
        System.out.println("Добавили: колбаски, моцарела, томатный соус, базилик, сливочный соус");
    }

    @Override
    protected void bake() {
        System.out.println("Выпекаем ...");
        try {
            Thread.sleep(25_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}