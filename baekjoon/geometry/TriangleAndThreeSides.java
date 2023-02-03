package baekjoon.geometry;

import java.io.*;
import java.util.Arrays;

/**
 * 5073번 삼각형과 세 변
 */
public class TriangleAndThreeSides {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int[] sides = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(sides[0] + sides[1] + sides[2] == 0) break;
            bw.write(JudgeType(sides)+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static String JudgeType(int[] sides) {
        if(sides[0] == sides[1] && sides[1] == sides[2]) {
            return "Equilateral";
        }

        Arrays.sort(sides);
        int max = sides[2];
        if(max >= sides[0] + sides[1]) {
            return "Invalid";
        }

        if(sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
            return "Isosceles";
        }

        return "Scalene";
    }
}