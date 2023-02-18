package baekjoon.sorting;

import java.util.Scanner;

/**
 * 2587번 대표값2
 */
public class RepresentativeValue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0 ; i < 5 ; i++) {
            int n = Integer.parseInt(sc.nextLine());
            numbers[i] = n;
        }
        sort(numbers);

        int sum = 0;
        for(int j = 0 ; j < 5 ; j ++) {
            sum += numbers[j];
        }
        System.out.println(sum/5);
        System.out.println(numbers[2]);
    }

    public static void sort(int[] numbers) {
        for(int i = 0 ; i < numbers.length - 1 ; i++) {
            for(int j = 0 ; j < numbers.length - i - 1 ; j++) {
                if(numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
