package lr1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String dayWeek = in.nextLine();
        System.out.println("Введите название месяца: ");
        String nameMonth = in.nextLine();
        System.out.println("Введите дату(номер дня в месяце): ");
        int dateNom = in.nextInt();
        System.out.println(dayWeek + " " + dateNom + " " + nameMonth);
        in.close();
    }

}
