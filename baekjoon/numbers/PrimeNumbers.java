package baekjoon.numbers;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 2581번 소수
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine());
        int N = Integer.parseInt(sc.nextLine());
        int[] ints = IntStream.range(M, N + 1).filter(PrimeNumbers::isPrime).toArray();
        if(ints.length > 0) {
            System.out.println(Arrays.stream(ints).sum());
            System.out.println(ints[0]);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
