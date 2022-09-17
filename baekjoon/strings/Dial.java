package baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 5622번 다이얼
 */
public class Dial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int total = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            total += time(s.charAt(i));
        }
        System.out.println(total);
    }

    public static int time(char c) {
        if( (int) c >= 'P' && (int) c <= 'S') {
            return 8;
        } else if( (int) c >= 'T' && (int) c <= 'V') {
            return 9;
        } else if( (int) c >= 'W' && (int) c <= 'Z') {
            return 10;
        } else {
            return 1 + 2 + ((int) c - 'A') / 3;
        }

    }
}
