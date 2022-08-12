package baekjoon.loop;

import java.util.Scanner;

/**
 * 25314번 코딩은 체육과목 입니다
 */
public class NByteInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int numberOfLong = N / 4;
        String dataTypeName = "";
        for(int i = 0 ; i < numberOfLong ; i++){
            dataTypeName += "long ";
        }
        dataTypeName += "int";
        System.out.println(dataTypeName);
        sc.close();
    }
}
