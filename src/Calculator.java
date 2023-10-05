import java.lang.reflect.Type;
import java.util.List;

public class Calculator {
    /**
     * sum() - Функция суммирует все элементы в массиве
     * @param list массив
     */
    public double sum(List<? extends Number> list) {
        double result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }

    /**
     * division() - Функция деления числа num1 на число num2
     * @param num1 делимое
     * @param num2 делитель
     */
    public double division(Number num1, Number num2) {
        double result = 0;
        result = num1.doubleValue() / num2.doubleValue();
        return result;
    }

    /**
     * multiplication() - Функция перемножает число num1 на число num2
     * @param num1 первое число
     * @param num2 второе число
     */
    public double multiplication(Number num1, Number num2) {
        double result = 0;
        result = num1.doubleValue() * num2.doubleValue();
        return result;
    }

    /**
     * digit() - Функция преобразует дробное число num в целочисленное
     * @param num дробное число
     */
    public int digit(double num) {
        int numDig = (int) num;
        return numDig;
    }

    /**
     * digitToBin() - Функция преобразует целое число num в бинарный код этого числа
     * @param num целое число
     */
    public String digitToBin(int num) {
        if (num == 0) return "";
        return digitToBin(num / 2) + (num % 2);
    }

    /**
     * fract() - Функция преобразует дробное число num в бинарный код этого числа
     * @param num дробное число
     * @param power точность (количество знаков после запятой/точки)
     */
    public String fract(double num, int power) {
        String result = "";
        String number = "";
        double numFrac = num - (int) num;
        int count = 1;
        while (count <= power) {
            numFrac = numFrac * 2;
            if (numFrac < 1) {
                result += 0;
            } else {
                numFrac = numFrac - 1;
                result += 1;
            }
            count++;
        }
        number = digitToBin(digit(num)) + "." + result;
        return number;
        }

    /**
     * numToBin() - Функция преобразует как дробное число num (строчное) так и целое число num (строчное)
     * в бинарный код этого числа
     * @param num дробное или целое число
     * @param power точность (количество знаков после запятой/точки)
     */
    public void numToBin(String num, int power) {
        double numDoub;
        numDoub = Double.parseDouble(num);
        if (((numDoub* 10) % 10) != 0) {
            System.out.println(num + " в бинарном коде будет = " + fract(numDoub,  power));
        } else {
            System.out.println(num + " в бинарном коде будет = " + digitToBin((int)numDoub));
        }
    }
}

