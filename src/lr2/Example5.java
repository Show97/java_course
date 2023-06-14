package lr2;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt();
        int result;

        if (a / 1000 != 0) {
            result = (a / 1000) % 10;
            System.out.println("В числе " + result + " тысяч.");
        } else {
            System.out.println("Число меньше 1 тысячи.");
        }

    }

}
