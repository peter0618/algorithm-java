package baekjoon.arrays;

import java.util.Scanner;

/**
 * 5597번 과제 안 내신 분..?
 */
public class SomeoneWhoDoseNotSubmitHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean students[] = new boolean[30+1];
        for(int i = 0 ; i < 28 ; i++) {
            int num = sc.nextInt();
            students[num] = true;
        }
        for(int i = 1 ; i <= 30 ; i++) {
            if(students[i] == false) System.out.println(i);
        }
        sc.close();
    }
}
