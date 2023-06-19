package lr3;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a;
        int d = b;

            System.out.println("Через for: ");
            if (c < d) {
                for (int c1 = c; c1 <= b; c1++) {
                    System.out.print(c1 + ", ");
                }
            } else {
                for (int d1 = d; d1 <= c; d1++) {
                    System.out.print(d1 + ", ");
                }
            }

            System.out.println("\nЧерез while: ");
                if (a > b) {
                    while (d <= c) {
                        System.out.print(d + ", ");
                        d++;
                    }
                } else {
                    while (c <= d){
                        System.out.print(c + ", ");
                        c++;
                    }
        }
    }
}