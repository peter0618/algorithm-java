package baekjoon.complexity;

import java.util.Scanner;

/**
 * 24313번 점근적 표기 1
 */
public class BigO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int a1 = Integer.parseInt(s[0]);
        int a0 = Integer.parseInt(s[1]);
        int c = Integer.parseInt(sc.nextLine());
        int n0 = Integer.parseInt(sc.nextLine());

        if((c == a1 && a0 <= 0) || (c > a1 && a0 / (c - a1) <= n0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
