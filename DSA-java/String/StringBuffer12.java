package DSA.String;
import  java.lang.*;
public class StringBuffer12 {
    public static void main(String[] args) {
        StringBuffer sc = new StringBuffer();

        // append() is used to add a string in StringBuffer
        sc.append("Hii");

        sc.append("  ");

        sc.append("How are you ");

        // insert() is used to add a String at Specific Position
        sc.insert(2,"Hello");

        // replaced() is used to replace a string from specific position
        sc.replace(2,6,"-----");

        System.out.println(sc.toString());

        // reverse() is used to reverse StringBuffer
        sc.reverse();

        // delete() used to delete a characters from string
        sc.delete(2,6);

        System.out.println(sc.toString());


    }
}
