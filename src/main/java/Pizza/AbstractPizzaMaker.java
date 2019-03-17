package Pizza;

public abstract class AbstractPizzaMaker {

    final String makePizza() {
        takeBase();
        fillIngredients();
        bake();
        cut();
        pack();

        return build();
    }

    protected abstract String build();

    private void takeBase() {
        System.out.println("Взяли заготовку.");
    }
    protected abstract void fillIngredients();

    protected abstract void bake();

    private void cut() {
        System.out.println("Нарезаем на 6 кусочков");
    }
    private void pack() {
        System.out.println("Упаковка");
    }
}
