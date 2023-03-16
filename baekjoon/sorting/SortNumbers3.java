package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10989번 수 정렬하기 3
 *
 * 수의 범위가 정해져 있을 때, 카운팅 정렬을 적용할 수 있다.
 */
public class SortNumbers3 {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 카운팅 정렬
        for(int i = 0 ; i < N ; i++) {
            int n = Integer.parseInt(br.readLine());
            numbers[n]++;
        }

        // 정렬된 데이터 출력
        StringBuilder sb = new StringBuilder(); // NOTE. 그냥 System.out.println 로만 출력하면 쓰기 속도가 느림
        for(int j = 1 ; j <= 10000 ; j++) {
            while(numbers[j] > 0) {
                sb.append((j)).append('\n');
                numbers[j]--;
            }
        }
        System.out.println(sb);
    }
}
