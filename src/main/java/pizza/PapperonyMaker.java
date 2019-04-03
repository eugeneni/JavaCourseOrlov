package Pizza;

public class PapperonyMaker extends AbstractPizzaMaker {

    @Override
    protected String build() {
        return "Papperony";
    }

    @Override
    protected void fillIngredients() {
        System.out.println("Добавили: колбаски папперони, моцарела, томатный соус, базилик, колбаски");
    }

    @Override
    protected void bake() {
        System.out.println("Выпекаем ...");
        try {
            Thread.sleep(15_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
