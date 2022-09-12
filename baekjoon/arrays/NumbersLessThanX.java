package baekjoon.arrays;

import java.io.*;
import java.util.Arrays;

/**
 * 10871번 X 보다 작은 수
 */
public class NumbersLessThanX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine().split(" ")[1]);

        Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .filter(n-> n < X)
                .forEach(n -> {
                    System.out.print(n + " ");
                });

        br.close();
    }
}
