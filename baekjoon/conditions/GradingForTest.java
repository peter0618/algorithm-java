package baekjoon.conditions;

import java.util.Scanner;

public class GradingForTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90 && score <= 100) {
            System.out.println("A");
            sc.close();
            return;
        }
        if(score >= 80) {
            System.out.println("B");
            sc.close();
            return;
        }
        if(score >= 70) {
            System.out.println("C");
            sc.close();
            return;
        }
        if(score >= 60) {
            System.out.println("D");
            sc.close();
            return;
        } else {
            System.out.println("F");
        }
    }
}
