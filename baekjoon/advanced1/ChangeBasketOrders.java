package baekjoon.advanced1;

import java.util.Scanner;

/**
 * 10812번 바구니 순서 바꾸기
 */
public class ChangeBasketOrders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        // 바구니 초기화
        int[] baskets = new int[N];
        for(int i = 0 ; i < N ; i++) {
            baskets[i] = i+1;
        }
        int[] newBaskets = baskets;
        for(int n = 0 ; n < M ; n++) {
            String[] strings = sc.nextLine().split(" ");
            int i = Integer.parseInt(strings[0]);
            int j = Integer.parseInt(strings[1]);
            int k = Integer.parseInt(strings[2]);
            newBaskets = rotate(newBaskets, i, j, k);
        }
        for(int i = 0 ; i < N ; i++) {
            System.out.print(newBaskets[i] + " ");
        }
        sc.close();
    }

    public static int[] rotate(int[] baskets, int i, int j, int k) {
        int[] newBaskets = new int[baskets.length];
        for(int p = 0 ; p < i-1 ; p++) {
            newBaskets[p] = baskets[p];
        }
        for(int q = i-1 ; q < j-k+i ; q++) {
            newBaskets[q] = baskets[q+k-i];
        }
        for(int r = j-k+i ; r < j ; r++) {
            newBaskets[r] = baskets[r-j+k-1];
        }
        for(int s = j ; s < baskets.length ; s ++) {
            newBaskets[s] = baskets[s];
        }
        return newBaskets;
    }
}
