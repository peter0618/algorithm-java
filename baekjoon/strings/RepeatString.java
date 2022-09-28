package baekjoon.strings;

import java.io.*;

/**
 * 2675번 문자열 반복
 */
public class RepeatString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T ; i++) {
            String[] strings = br.readLine().split(" ");
            int repeat = Integer.parseInt(strings[0]);
            String letters = strings[1];
            String result = "";
            for(int j = 0 ; j < letters.length() ; j++) {
                result += repeatChar(letters.charAt(j), repeat);
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static String repeatChar(char c, int n) {
        String s = "";
        for(int i = 0 ; i < n ; i++){
            s += c;
        }
        return s;
    }
}
