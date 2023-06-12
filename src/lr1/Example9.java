package lr1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String nameMonth = in.nextLine();
        System.out.println("Введите количество дней в этом месяце: ");
        int dateNom = in.nextInt();
        System.out.println("В месяце " + nameMonth + " " + dateNom + " дней.");
        in.close();
    }

}
