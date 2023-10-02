import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // -----------------------------------------------------
        // Задание 3
        // 3)	Написать класс калькулятор, принимающий List
        // целочисленных значений, возвращающий сумму элементов
        // коллекции (метод sum)

        Calculator calcutalor = new Calculator();
        System.out.println(calcutalor.sum(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8))));
//        System.out.println(calcutalor.sum(new ArrayList<>(Arrays.asList("ad", "a", "d"))));

    }
}