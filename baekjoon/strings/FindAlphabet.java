package baekjoon.strings;

import java.util.Scanner;

/**
 * 10809번 알파벳 찾기
 */
public class FindAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i = 'a' ; i <= 'z' ; i++){
            System.out.print(word.indexOf((char) i) + " ");
        }
        sc.close();
    }
}