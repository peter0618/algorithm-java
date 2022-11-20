package baekjoon.arrays2;

import java.util.Scanner;

/**
 * 2563번 색종이
 */
public class ColoredPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] areas = new int[100][100];
        int area = 0;
        for(int n = 0 ; n < N ; n++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int i = x ; i < x+10 ; i++) {
                for(int j = y ; j < y+10 ; j++) {
                    areas[i][j] = 1;
                }
            }
        }
        for(int i = 0 ; i < 100 ; i++) {
            for(int j = 0 ; j < 100 ; j++) {
                area += areas[i][j];
            }
        }
        System.out.println(area);
        sc.close();
    }
}
