package baekjoon.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 11653번 소인수 분해
 */
public class PrimeFactorDecomposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] numbers = decompose(N);
        if (numbers.length != 0 ) {
            Arrays.stream(numbers).forEach(System.out::println);
        }
        sc.close();
    }

    public static int[] decompose(int N) {
        if(N == 1) {
            return new int[]{};
        }
        List<Integer> numbers = new ArrayList<>();

        for(int p = 2 ; p <= N ; p++) {
            while(N % p == 0) {
                numbers.add(p);
                N = N / p;
            }
        }

        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
