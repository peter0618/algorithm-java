package baekjoon.loop;

import java.io.*;

/**
 * 10952번 A+B - 5
 */
public class PrintAplusB5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String[] numbers = br.readLine().split(" ");
            if((Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1])) == 0) break;
            bw.write((Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1])) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
