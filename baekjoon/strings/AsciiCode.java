package baekjoon.strings;

import java.util.Scanner;

/**
 * 11654번 아스키코드
 */
public class AsciiCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int asciiCode = s.charAt(0);
        System.out.println(asciiCode);
        sc.close();
    }
}
