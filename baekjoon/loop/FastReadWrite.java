package baekjoon.loop;

import java.io.*;

/**
 * 15552번 빠른 A+B
 */
public class FastReadWrite {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0 ; i < T ; i++) {
            String[] numbers = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            bufferedWriter.write((a + b)+"\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
