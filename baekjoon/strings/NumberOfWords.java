package baekjoon.strings;

import java.util.Scanner;

/**
 * 1152번 단어의 개수
 */
public class NumberOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().trim().split(" ").length);
        sc.close();
    }
}
