package baekjoon.geometry;

import java.util.Scanner;

/**
 * 27323번 직사각형
 */
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());
        System.out.println(A*B);
        sc.close();
    }
}
