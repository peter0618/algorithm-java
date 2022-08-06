package baekjoon.loop;

import java.util.Scanner;

/**
 * 8393번 합
 */
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n * (n+1))/ 2);
        sc.close();
    }
}
