package baekjoon.conditions;

import java.util.Scanner;

/**
 * 윤년 계산기
 *
 * 윤년이면 1, 아니면 0 을 출력합니다.
 * 윤년 : 4의 배수 이면서 100의 배수가 아닐 때, 또는 400의 배수일 때
 */
public class LeadYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean isLeadYear = (year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0;
        System.out.println(isLeadYear ? 1 : 0);

        sc.close();
    }
}
