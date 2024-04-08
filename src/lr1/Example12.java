package lr1;

import java.util.Scanner;

public class Example12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dateNow = 2024;
        System.out.println("Введите ваш возраст: ");
        int v = in.nextInt();
        int dateBorn = dateNow-v;
        System.out.println("Ваш год рождения "+ dateBorn);
        in.close();
    }

}
