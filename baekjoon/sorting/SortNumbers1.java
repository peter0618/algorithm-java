package baekjoon.sorting;

import java.util.Scanner;

/**
 * 2750번 수 정렬하기
 */
public class SortNumbers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[N];
        for(int i = 0 ; i < N ; i++) {
            int n = Integer.parseInt(sc.nextLine());
            numbers[i] = n;
        }

        sort(numbers);
        for(int i = 0 ; i < N ; i++) {
            System.out.println(numbers[i]);
        }
        sc.close();
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
