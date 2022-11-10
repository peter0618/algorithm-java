package baekjoon.arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 2738번 행렬 덧셈
 */
public class MatrixAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] conditions = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = conditions[0];
        int M = conditions[1];
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        for(int i = 0 ; i < N ; i++) {
            int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = 0 ; j < M ; j++) {
                A[i][j] = numbers[j];
            }
        }
        for(int i = 0 ; i < N ; i++) {
            int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = 0 ; j < M ; j++) {
                B[i][j] = numbers[j];
            }
        }
        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < M ; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
