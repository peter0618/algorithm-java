package baekjoon.arrays;

import java.util.Scanner;

/**
 * 10811번 바구니 뒤집기
 */
public class FlipBaskets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] baskets = new int[N+1];
        for(int n = 1 ; n <= N ; n++) {
            baskets[n] = n;
        }

        for(int m = 0 ; m < M ; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            for(int k = 0 ; k < (j-i+1)/2 ; k++) {
                int temp = baskets[i+k];
                baskets[i+k] = baskets[j-k];
                baskets[j-k] = temp;
            }
        }

        for(int n = 1 ; n <= N ; n++) {
            System.out.print(baskets[n] + " ");
        }

        sc.close();
    }
}
