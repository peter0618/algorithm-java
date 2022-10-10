package baekjoon.advanced1;

import java.io.*;
import java.util.Arrays;

/**
 * 4344번 평균은 넘겠지
 */
public class CheckAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfTestCases = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < numberOfTestCases ; i++) {
            int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int numberOfStudents = numbers[0];
            int sum = 0;
            for(int j=1 ; j <= numberOfStudents ; j++) {
                sum += numbers[j];
            }
            int avg = sum / numberOfStudents;
            int count = 0;
            for(int k=1 ; k <= numberOfStudents ; k++) {
                if(avg < numbers[k]) count++;
            }
            bw.write(String.format("%.3f", (float) count/numberOfStudents * 100)+ "%\n");
        }
        bw.flush();
        bw.close();
    }
}
