package lr2;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 5 до 10: ");
        int a = in.nextInt();


        if (a < 11 && a > 4) {
            System.out.println("Вы попали в диапозон!");
        } else {
            System.out.println("Введенное число не соответствует диапозону.");
        }
    }

}

