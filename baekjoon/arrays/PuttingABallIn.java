package baekjoon.arrays;

import java.util.Scanner;

/**
 * 10810번 공넣기
 */
public class PuttingABallIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 수
        int M = sc.nextInt();
        int[] baskets = new int[N+1];
        for(int i = 0 ; i < M ; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int numberOfBall = sc.nextInt();
            for(int j = from ; j <= to ; j++) {
                baskets[j] = numberOfBall;
            }
        }
        for(int i = 1 ; i <= N ; i++) {
            System.out.print(baskets[i] + " ");
        }
        sc.close();
    }
}
