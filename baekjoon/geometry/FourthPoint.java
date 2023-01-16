package baekjoon.geometry;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 3009번 네 번째 점
 */
public class FourthPoint {
    public static void main(String[] args) {
        // 네 좌표가 직사각형을 이루려면 똑같은 숫자가 x,y 좌표에 각각 2개씩 존재해야 한다.
        Scanner sc = new Scanner(System.in);
        int[] numbers_x = new int[3];
        int[] numbers_y = new int[3];
        IntStream.range(0,3).forEach(index -> {
            int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            numbers_x[index] = numbers[0];
            numbers_y[index] = numbers[1];
        });
        int x = numbers_x[0] == numbers_x[1] ? numbers_x[2] : numbers_x[0] == numbers_x[2] ? numbers_x[1] : numbers_x[0];
        int y = numbers_y[0] == numbers_y[1] ? numbers_y[2] : numbers_y[0] == numbers_y[2] ? numbers_y[1] : numbers_y[0];
        System.out.println(x + " " + y);
        sc.close();
    }
}
