package baekjoon.arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2566번 최댓값
 */
public class MaxNumberOfMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int rowIndexOfMax = 1;
        int colIndexOfMax = 1;
        for(int i = 0 ; i < 9 ; i++) {
            String[] s = br.readLine().split(" ");
            for(int j = 0 ; j < s.length ; j++) {
                if (Integer.parseInt(s[j]) > max) {
                    rowIndexOfMax = i+1;
                    colIndexOfMax = j+1;
                    max = Integer.parseInt(s[j]);
                }
            }
        }
        System.out.println(max);
        System.out.print(rowIndexOfMax+" "+colIndexOfMax);
    }
}
