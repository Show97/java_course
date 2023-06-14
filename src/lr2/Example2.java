package lr2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");

        int a = in.nextInt();

        int result1 = a % 5;
        int result2 = a % 7;

        System.out.println("Результат: " + result1);
        System.out.println("Результат: " + result2);

        if (result1 == 2) {
            System.out.println("Введенное число при делении на 5 в остатке получает 2");
        } else {
            System.out.println("Введенное число при делении на 5 в остатке не получает 2");
        }

        if (result2 == 1) {
            System.out.println("Введенное число при делении на 7 в остатке получает 1");
        } else {
            System.out.println("Введенное число при делении на 7 в остатке не получает 1");
        }


    }

}
