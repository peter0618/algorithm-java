package baekjoon.conditions;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialH = sc.nextInt();
        int initialM = sc.nextInt();

        final int M = initialM - 45 >= 0 ? initialM - 45 : initialM - 45 + 60;
        final int H = initialM - 45 >= 0 ? initialH : initialH - 1 >= 0 ? initialH - 1 : initialH - 1 + 24;

        System.out.println(H + " " + M);

        sc.close();
    }
}
