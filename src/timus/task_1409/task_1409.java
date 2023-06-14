package timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int banki = a + b -1;

        int harry = banki - a;
        int larry = banki - b;



        out.println(harry + " " + larry);
        out.flush();

    }

}
