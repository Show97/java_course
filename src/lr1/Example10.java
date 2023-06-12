package lr1;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dateNow = 2023;
        System.out.println("Введите год своего рождения: ");
        int dateBorn = in.nextInt();
        int v = dateNow-dateBorn;
        System.out.println("Ваш возраст равен "+ v);
        in.close();
    }

}
