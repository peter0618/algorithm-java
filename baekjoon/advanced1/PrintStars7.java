package baekjoon.advanced1;

import java.util.Scanner;

/**
 * 2444번 별 찍기-7
 */
public class PrintStars7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1 ; i <= 2*N - 1 ; i++) {
            printSpaces(Math.abs(N-i));
            if(i <= N) {
                printStars(2*i - 1);
            } else {
                printStars(4*N - 2*i - 1);
            }
            if(i != 2*N -1) System.out.println("");
        }
        sc.close();
    }

    public static void printSpaces(int n) {
        for(int i = 0 ; i < n ; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int n) {
        for(int i = 0 ; i < n ; i++) {
            System.out.print("*");
        }
    }
}
