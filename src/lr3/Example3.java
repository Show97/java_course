package lr3;
import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        long a = 0;
        long b = 1;
        long c = 1;
        int y = size;
        long d = 0;
        long e = 1;
        long f = 1;

        if (size > 0) {
            System.out.println("Через for:");
            for (int i = y; i > 0; --i) {
                System.out.printf("%d, ", f);
                f = d + e;
                d = e;
                e = f;
            }
            System.out.println("\nЧерез while:");
            while (size > 0) {
                System.out.printf("%d, ", c);
                c = a + b;
                a = b;
                b = c;
                size--;
            }
        } else {
            System.out.println("Число должно быть положительным!");
        }
    }
}
