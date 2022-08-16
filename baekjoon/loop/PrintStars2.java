package baekjoon.loop;

import java.util.Scanner;

/**
 * 2439번 별 찍기-2
 */
public class PrintStars2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1 ; i <= N ; i++) {
            for (int k = 0 ; k < N - i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
