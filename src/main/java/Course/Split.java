package Course;

public class Split {

    public static void stringSplit(String word) {

        String[] words = word.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)
        // Вывод на экран
        for(String subStr:words) {
            System.out.println(subStr);
        }
    }
}
