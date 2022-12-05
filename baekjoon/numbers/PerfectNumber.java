package baekjoon.numbers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 9506번 약수들의 합
 */
public class PerfectNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1) break;
            List<Integer> list = new ArrayList<>();
            for(int n = 1 ; n < N ; n++) {
                if (N % n == 0) list.add(n);
            }
            int sum = list.stream().mapToInt(Integer::intValue).sum();

            StringBuilder sb = new StringBuilder();
            if(N == sum) {
                sb.append(N).append(" = ");
                String collect = list.stream().mapToInt(Integer::intValue).mapToObj((item) -> item + "").collect(Collectors.joining(" + "));
                sb.append(collect);
            } else {
                sb.append(N).append(" is NOT perfect.");
            }
            bw.write(sb.append("\n").toString());
        }
        bw.flush();
        bw.close();
    }
}
