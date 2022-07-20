package baekjoon.loop;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int dan = sc.nextInt();

        IntStream.range(1,10).forEach(n -> {
            System.out.println(dan + " * " + n + " = " + dan * n);
        });

        sc.close();
    }
}
