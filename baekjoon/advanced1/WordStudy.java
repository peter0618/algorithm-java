package baekjoon.advanced1;

import java.util.Scanner;

/**
 * 1157번 단어 공부
 */
public class WordStudy {
    public static void main(String[] args) {
        int[] countOfLetter = new int[26]; // 모두 0 으로 초기화
        String letterWithMaxCount = "?";   // 최초에는 count 가 다 0이므로 ? 로 초기화
        int maxCount = 0;

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i = 0 ; i < s.length() ; i++) {
            char ch = String.valueOf(s.charAt(i)).toUpperCase().charAt(0); // 대문자 변환
            countOfLetter[(int)ch - 65]++; // 해당 대문자 갯수 counting
            if(countOfLetter[(int)ch - 65] > maxCount) {
                maxCount++;
                letterWithMaxCount = ch+"";
            } else if (countOfLetter[(int)ch - 65] == maxCount) {
                letterWithMaxCount = "?";
            }
        }
        System.out.println(letterWithMaxCount);
        sc.close();
    }
}
