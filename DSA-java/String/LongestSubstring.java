package DSA.String;

public class LongestSubstring {
    public static void main(String[] args) {
//        Longest Substring Without Repeating Characters: Given a string, find the length of the longest substring without repeating characters.
//        For example, the longest substring without repeating characters in "abcabcbb" is "abc", which has a length of 3.

        String name = "abcabcbb";

        String ans = "";
        int maxLength = 0;
        StringBuilder sc = new StringBuilder();

        for(int i = 0; i < name.length();i++){
            char  chars = name.charAt(i);
            String a = Character.toString(chars);
            if( ! (ans.contains(a))){
                ans += a;
                maxLength ++;
            }else {
                sc.append(ans);
                ans = "";

            }
        }

    }
}
