package baekjoon.loop;

import java.util.Scanner;

/**
 * 2438번 별 찍기-1
 */
public class PrintStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1 ; i <= N ; i++) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
