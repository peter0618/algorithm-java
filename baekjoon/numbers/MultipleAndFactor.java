package baekjoon.numbers;

import java.util.Scanner;

/**
 * 5086번 배수와 약수
 */
public class MultipleAndFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String[] s = sc.nextLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            if( x == 0 && y == 0) break;
            if (x % y == 0) {
                System.out.println("multiple");
            } else if ( y % x == 0 ){
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
        sc.close();
    }
}
