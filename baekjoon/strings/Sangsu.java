package baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 2908번 상수
 */
public class Sangsu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int[] numbers = Arrays.stream(tokens)
                .map(token -> new StringBuffer(token).reverse().toString())
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(numbers[0] > numbers[1] ? numbers[0] : numbers[1]);
    }
}
