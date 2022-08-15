package baekjoon.loop;

import java.io.*;

/**
 * 11021번 A+B - 7
 */
public class PrintAplusB7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < T ; i++) {
            String[] numbers = br.readLine().split(" ");
            bw.write("Case #" + (i+1) + ": " + (Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1])) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
