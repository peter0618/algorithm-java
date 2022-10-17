package baekjoon.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10818번 최소, 최대
 */
public class MaxAndMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] numbersInString = br.readLine().split(" ");
        int min = Integer.parseInt(numbersInString[0]);
        int max = Integer.parseInt(numbersInString[0]);
        for(int i = 0 ; i < numbersInString.length ; i++) {
            int number = Integer.parseInt(numbersInString[i]);
            if(number < min) min = number;
            if(number > max) max = number;
        }
        System.out.println(min + " " + max);
    }
}
