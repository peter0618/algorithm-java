package baekjoon.arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10798번 세로읽기
 */
public class ReadVertically {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] chars = new char[5][];
        int maxCountOfRows = 0;
        for(int i = 0 ; i < 5 ; i++) {
            chars[i] = br.readLine().toCharArray();
            if(maxCountOfRows < chars[i].length) maxCountOfRows = chars[i].length;
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 0 ; j < maxCountOfRows ; j++) {
            for(int i = 0 ; i < 5 ; i++) {
                if(chars[i].length > j) sb.append(chars[i][j]);
            }
        }
        System.out.println(sb);
    }
}
