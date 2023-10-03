import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> list) {
        double result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }

    public double division( Number num1, Number num2) {
        double result = 0;
        result = num1.doubleValue() / num2.doubleValue();
        return result;
    }
    public double multiplication(Number num1, Number num2) {
        double result = 0;
        result = num1.doubleValue() * num2.doubleValue();
        return result;
    }
    public String toBinary(int n) {
        if (n == 0) return "";
        return toBinary(n / 2) + (n % 2);
    }
}
