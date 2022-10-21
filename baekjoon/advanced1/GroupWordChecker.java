package baekjoon.advanced1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 1316번 그룹 단어 체커
 */
public class GroupWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int count = 0;
        for(int i = 0 ; i < N ; i++) {
            if(check(sc.nextLine())) count++;
        }
        System.out.println(count);
        sc.close();
    }

    public static boolean check(String str) {
        Set<Character> set = new HashSet<>();
        char charBefore = 0;
        for(char c : str.toCharArray()) {
            if(set.contains(c)) return false;
            if(charBefore == c) continue;
            if(charBefore != 0) set.add(charBefore);
            charBefore = c;
        }
        return true;
    }
}
