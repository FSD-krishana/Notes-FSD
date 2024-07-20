package DSA.String;

public class StringtoInteger {
    //    String to Integer (atoi): Implement the atoi function that converts a string to an integer.
//    Handle overflow and ignore whitespace.
    public static void main(String[] args) {

        String Number = "23,23,23,23,23,3,34,42";

        String[] num = Number.split(",");

        int[] ans = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            ans[i] = Integer.parseInt(num[i]);
            System.out.print(ans[i] + " ");
        }


    }
}
