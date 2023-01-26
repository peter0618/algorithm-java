package baekjoon.geometry;

import java.util.Scanner;

/**
 * 10101번 삼각형 외우기
 */
public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angles = new int[3];
        for(int i = 0 ; i < 3 ; i++) {
            angles[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(getTypeOfTriangle(angles));
        sc.close();
    }

    public static String getTypeOfTriangle(int[] angles) {
        if(angles[0] + angles[1] + angles[2] != 180) {
            return "Error";
        }
        if(angles[0] == angles[1] && angles[1] == angles[2]) {
            return "Equilateral";
        }
        if(angles[0] == angles[1] || angles[0] == angles[2] || angles[1] == angles[2]){
            return "Isosceles";
        }
        return "Scalene";
    }
}
