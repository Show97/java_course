package lr1;

import java.util.Scanner;

public class Example11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dateNow = 2024;
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите год своего рождения: ");
        int dateBorn = in.nextInt();
        int v = dateNow-dateBorn;
        System.out.println(name + ", ваш возраст равен "+ v);
        in.close();
    }

}
