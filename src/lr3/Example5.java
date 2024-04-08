package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите кол-во чисел в сумме: ");
        int a = in.nextInt();
        int c = a;
        int d = 0;
        int e = 0;

        System.out.println("Через while: ");
        while (a > 0) {
            int ran = random.nextInt(100);
            if (ran % 5 == 2 || ran % 3 == 1) {
                System.out.print(ran + ", ");
                d = d + ran;
                a--;
            }
        }
        System.out.print("\nСумма = " + d);

        System.out.println("\nЧерез for: ");
            for (int i = 0; c > 0; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.print(i + ", ");
                    e = e + i;
                    c--;
                }
            }
            System.out.println("\nСумма = " + e);
    }
}
