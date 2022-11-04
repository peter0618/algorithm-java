package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 25206번 너의 평점은
 */
public class YourGrade {
    public static void main(String[] args) throws IOException {
        Map<String,Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalPoint = 0;
        double total = 0;
        String input="";
        while((input = br.readLine()) != null && !input.isEmpty()) {
            String[] s = input.split(" ");
            if(s[2].equalsIgnoreCase("P")) continue;
            double grade = map.get(s[2]);
            double point = Double.parseDouble(s[1]);
            totalPoint += point;
            total += point * grade;
        }
        System.out.println(total / totalPoint);
    }
}
