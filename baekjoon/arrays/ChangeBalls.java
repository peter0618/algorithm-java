package baekjoon.arrays;

import java.util.Scanner;

/**
 * 10813번 공 바꾸기
 */
public class ChangeBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] baskets = new int[N+1];

        // 초기화
        for(int m = 1 ; m <= N ; m++) {
            baskets[m] = m;
        }

        // i,j swap
        for(int n = 0 ; n < M ; n++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }

        for(int m = 1 ; m <= N ; m++) {
            System.out.print(baskets[m] + " ");
        }
        sc.close();
    }
}
