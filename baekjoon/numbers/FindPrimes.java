package baekjoon.numbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1978번 소수 찾기
 */
public class FindPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        long count = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .filter((n) -> isPrime(n))
                .count();
        System.out.println(count);
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