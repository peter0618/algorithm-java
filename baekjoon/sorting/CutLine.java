package baekjoon.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 25305번 커트라인
 */
public class CutLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine().split(" ")[1]);
        int[] scores = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        sortDesc(scores);
        System.out.println(scores[k-1]);
        sc.close();
    }

    public static void sortDesc(int[] numbers) {
        for(int i = 0 ; i < numbers.length - 1 ; i++) {
            for(int j = 0 ; j < numbers.length - i - 1 ; j++) {
                if(numbers[j] < numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
