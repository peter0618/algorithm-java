package baekjoon.conditions;

import java.util.Scanner;

/**
 * 주어진 좌표가 몇 사분면인지 계산하기.
 */
public class QuadrantCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if( x > 0 && y > 0) System.out.println(1);
        if( x < 0 && y > 0) System.out.println(2);
        if( x < 0 && y < 0) System.out.println(3);
        if( x > 0 && y < 0) System.out.println(4);

        sc.close();

    }
}
