package baekjoon.strings;

import java.io.*;

/**
 * 9086번 문자열
 */
public class FirstAndLastLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T ; i++) {
            String s = br.readLine();
            bw.write("" + s.charAt(0) + s.charAt(s.length() - 1) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
