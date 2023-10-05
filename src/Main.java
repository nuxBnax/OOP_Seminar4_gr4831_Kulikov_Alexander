import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Calculator calcutalor = new Calculator();
        System.out.println(calcutalor.sum(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8))));

        System.out.println(calcutalor.division(5, 2));
        System.out.println("calcutalor.multiplication(5,2) = " + calcutalor.multiplication(5, 2));


        System.out.println("calcutalor.fract(5.375,4) = " + calcutalor.fract(5.375, 4));
        System.out.println("calcutalor.digitToBin(5) = " + calcutalor.digitToBin(5));

        calcutalor.numToBin("5.375",4);
        calcutalor.numToBin("5",4);
    }
}