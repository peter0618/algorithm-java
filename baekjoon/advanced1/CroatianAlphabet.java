package baekjoon.advanced1;

import java.util.Scanner;

/**
 * 2941번 크로아티아 알파벳
 */
public class CroatianAlphabet {
    public static void main(String[] args) {
        String[] croatianAlphabets = {"c=","c-","dz=","d-", "lj", "nj", "s=", "z="};
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int totalNumberOfAlphabets = 0 ;
        while(string.length() > 0) {
            boolean hasCroatianAlphabets = false;
            for(String alphabet : croatianAlphabets) {
                if(string.indexOf(alphabet) == 0){
                    string = string.substring(alphabet.length());
                    totalNumberOfAlphabets++;
                    hasCroatianAlphabets = true;
                    break;
                }
            }
            if(!hasCroatianAlphabets) {
                string = string.substring(1);
                totalNumberOfAlphabets++;
            }
        }
        System.out.println(totalNumberOfAlphabets);
        sc.close();
    }
}
