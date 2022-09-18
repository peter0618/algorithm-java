package baekjoon.strings;

import java.io.*;

/**
 * 11718번 그대로 출력하기
 */
public class PrintOrigin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        while((input = br.readLine()) != null && !input.isEmpty()) {
            bw.write(input+"\n");
        }
        bw.flush();
        bw.close();
    }

}
