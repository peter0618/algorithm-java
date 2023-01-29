package baekjoon.geometry;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 14215번 세 막대
 */
public class ThreeRods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calMaxRound(
                                        Arrays.stream(sc.nextLine().split(" "))
                                                .mapToInt(Integer::parseInt)
                                                .toArray()
                                       )
        );
        sc.close();
    }

    public static int calMaxRound(int[] numbers) {
        Arrays.sort(numbers);
        while(numbers[0] + numbers[1] <= numbers[2] ) numbers[2] --;
        return numbers[0] + numbers[1] + numbers[2];
    }
}
