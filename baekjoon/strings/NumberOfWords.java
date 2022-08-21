package baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1152번 단어의 개수
 */
public class NumberOfWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().trim().split(" ");
        if(tokens.length == 1 && tokens[0].equalsIgnoreCase("")) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
        }
    }
}
