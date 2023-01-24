package baekjoon.geometry;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 9063번 대지
 */
public class AreaOfSite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int x_min = 0;
        int x_max = 0;
        int y_min = 0;
        int y_max = 0;
        for (int i = 0 ; i < N ; i++) {
            int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(i == 0) {
                x_max = numbers[0];
                x_min = numbers[0];
                y_max = numbers[1];
                y_min = numbers[1];
            } else {
                if(x_max < numbers[0]) x_max = numbers[0];
                if(x_min > numbers[0]) x_min = numbers[0];
                if(y_max < numbers[1]) y_max = numbers[1];
                if(y_min > numbers[1]) y_min = numbers[1];
            }
        }
        System.out.println((x_max - x_min) * (y_max - y_min));
        sc.close();
    }
}
