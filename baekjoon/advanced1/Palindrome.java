package baekjoon.advanced1;

import java.util.Scanner;

/**
 * 10988번 팰린드롬인지 확인하기
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = 1;
        for(int i = 0 ; i < s.length() / 2 ; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                result = 0;
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
