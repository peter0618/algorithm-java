package baekjoon.strings;

import java.util.Scanner;

/**
 * 27866번 문자와 문자열
 */
public class CharAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int i = sc.nextInt();
        System.out.println(word.charAt(i-1));

        sc.close();
    }
}
