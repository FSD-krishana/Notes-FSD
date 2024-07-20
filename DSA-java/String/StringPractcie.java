package DSA.String;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractcie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstString = sc.next();
        String SecondString = sc.next();
        boolean isAna = true;


        char[] firstStr = firstString.toCharArray();
        char[] secondStr = SecondString.toCharArray();

        Arrays.sort(firstStr);
        Arrays.sort(secondStr);

        if (firstStr.length == secondStr.length) {
            for (int i = 0; i < firstStr.length; i++) {
                if (firstStr[i] != secondStr[i]) {
                    isAna = false;
                    break;
                }
            }
        }
        else {
            isAna = false;
            System.out.println(isAna);
        }
        System.out.println(isAna);
    }
}
