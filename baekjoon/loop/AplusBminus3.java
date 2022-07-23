package baekjoon.loop;

import java.util.Scanner;

/**
 * (10950번) A+B - 3
 */
public class AplusBminus3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] answers = new int[T];
        for (int i = 0 ; i < answers.length ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            answers[i] = a + b;
        }
        for (int answer : answers) {
            System.out.println(answer);
        }

        sc.close();
    }

}
