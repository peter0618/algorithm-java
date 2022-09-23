package baekjoon.arrays;

import java.util.Scanner;

/**
 * 10807번 개수 세기
 */
public class CountInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        int count = 0;
        for(int i = 0 ; i < N ; i++) {
            numbers[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for(int i = 0 ; i < N ; i++) {
            if(v == numbers[i]) count++;
        }
        System.out.println(count);

        sc.close();
    }
}
