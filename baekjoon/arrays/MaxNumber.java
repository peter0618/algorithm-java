package baekjoon.arrays;

import java.util.Scanner;

/**
 * 2562번 최댓값
 */
public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int indexOfMax = 0;
        for(int i = 1 ; i <= 9 ; i++) {
            int number = sc.nextInt();
            if(number > max) {
                max = number;
                indexOfMax = i;
            }
        }
        System.out.println(max);
        System.out.println(indexOfMax);
        sc.close();
    }
}
