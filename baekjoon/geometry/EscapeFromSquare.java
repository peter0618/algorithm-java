package baekjoon.geometry;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1085번 직사각형에서 탈출
 */
public class EscapeFromSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] integers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = integers[0];
        int y = integers[1];
        int w = integers[2];
        int h = integers[3];
        System.out.println(Math.min(Math.min(x,y), Math.min(w-x, h-y)));
        sc.close();
    }
}
