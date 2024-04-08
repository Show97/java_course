package lr2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");

        int a = in.nextInt();

        boolean result1 = a % 5 == 2;
        boolean result2 = a % 7 == 1;

        if (result1 && result2) {
            System.out.println("Введенное число " + a + " удовлетворяет критериям.");
        } else {
            System.out.println("Введенное число " + a + " не удовлетворяет критериям.");
        }
    }

}
