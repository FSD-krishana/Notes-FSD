package DSA.Stack;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class StackDataStructure {


    public static void main(String[] args) {
        // Create a Stack

        // Revers String using Stack

        Stack<Character> st = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String str =  sc.next();

        String str2="";

        for(int i = 0 ;i < str.length() ; i++){
            st.push(str.charAt(i));
        }

        while (!st.isEmpty()){
            str2 =  str2+st.pop();
        }

        System.out.println(str2);
    }
}
