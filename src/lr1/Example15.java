package lr1;

import java.util.Scanner;

public class Example15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int a = in.nextInt();
        System.out.println("Введите число 2: ");
        int b = in.nextInt();
        int c = a+b;
        int d = a-b;
        System.out.println("Сумма чисел равна " + c + ", а разность равна " + d + ".");
        in.close();
    }

}
