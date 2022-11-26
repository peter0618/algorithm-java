package baekjoon.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2501번 약수 구하기
 */
public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        List<Integer> list = new ArrayList<>();
        for(int n = 1 ; n <= N ; n++) {
            if(N % n == 0) list.add(n);
        }
        System.out.println(list.size() < K ? 0 : list.get(K-1));
        sc.close();
    }
}
