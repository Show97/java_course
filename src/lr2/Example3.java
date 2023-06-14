package lr2;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое целое число больше 10: ");

        int a = in.nextInt();
        int result = a % 4;

        if (a > 10) {
        } else {
            System.out.println("К сожалению число меньше 10 =(, в следующий раз у тебя получиться!");
            return;
        }

        if (result == 0) {
            System.out.println("Введенное число делиться на 4 без остатка.");
        } else {
            System.out.println("Введенное число не делиться на 4 без остатка.");
        }

    }

}
