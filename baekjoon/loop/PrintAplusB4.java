package baekjoon.loop;

import java.io.*;

/**
 * 10951번 A+B - 4
 * (https://gre-eny.tistory.com/307 참고)
 */
public class PrintAplusB4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        while((input = br.readLine()) != null && !input.isEmpty()){
            String[] numbers = input.split(" ");
            bw.write((Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1])) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
