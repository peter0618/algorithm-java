package baekjoon.conditions;

import java.util.Scanner;

/**
 * 오븐 시계 (2525번)
 */
public class OvenClock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 시 (0~23)
        int B = sc.nextInt(); // 분 (0~59)
        int C = sc.nextInt(); // 요리하는 데 필요한 시간 (0~1000) 분 (최대 16시간)

        int H = A + ((B + C) / 60);
        H = H < 24 ? H : H - 24;
        int M = (B + C) % 60;

        System.out.println(H + " " + M);

        sc.close();
    }
}
