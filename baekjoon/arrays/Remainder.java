package baekjoon.arrays;

import java.util.Scanner;

/**
 * 3052번 나머지
 */
public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] countOfRemainders = new int[42];
        int distinctRemainders = 0;

        for(int i = 0 ; i < 10 ; i++) {
            countOfRemainders[sc.nextInt() % 42]++;
        }

        for(int i = 0 ; i < 42 ; i++) {
            if(countOfRemainders[i] != 0) distinctRemainders++;
        }
        System.out.println(distinctRemainders);
        sc.close();
    }
}
