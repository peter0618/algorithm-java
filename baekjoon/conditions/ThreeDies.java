package baekjoon.conditions;

import java.util.Scanner;

/**
 * 주사위 세개 (2480 번)
 */
public class ThreeDies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();

        int reward;

        if (dice1 == dice2 && dice2 == dice3) { // 같은 눈이 3개
            reward = 10000 + dice1 * 1000;
        } else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) { // 같은 눈이 2개
            int sameDice = dice1 == dice2 ? dice1 : dice3; // 경우의 수를 계산해보면... dice1 과 dice2 가 다른 경우 dice3 이 같은 눈이 될수 밖에 없다.
            reward = 1000 + sameDice * 100;
        } else { // 모두 다른 눈
            int maxDice = Max(Max(dice1, dice2), dice3);
            reward = maxDice * 100;
        }

        System.out.println(reward);
        sc.close();
    }

    public static int Max(int a, int b) {
        return a >= b ? a : b;
    }
}
