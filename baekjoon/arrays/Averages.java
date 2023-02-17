package baekjoon.arrays;

import java.util.Scanner;

/**
 * 1546번 평균
 */
public class Averages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int max = 0;
        for(int i = 0; i < N ; i++) {
            int number = sc.nextInt();
            sum += number;
            if(number > max) max = number;
        }
        System.out.println((double)(100 * sum) / (max * N));
    }
}
