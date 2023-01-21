package baekjoon.geometry;

import java.util.Scanner;

/**
 * 15894번 수학은 체육과목 입니다
 *
 * 맨 아래 부분의 정사각형 개수 N 이 주어졌을 때,
 * 1(상) + N(하) + N(좌) + N(우) + (N-1)(중간) = 4N
 */
public class MathIsPhysicalEducation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.nextLine());
        System.out.println(4*N);
        sc.close();
    }
}
