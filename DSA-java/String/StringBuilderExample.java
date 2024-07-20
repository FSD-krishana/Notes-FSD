package DSA.String;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder();

        // append() is used to add a string in StringBuilder
        sc.append("Hii");
        sc.append("  ");
        sc.append("How are you ");

        // insert() is used to add a String at Specific Position
        sc.insert(2,"Hello");

        // replaced() is used to replace a string from specific position
        sc.replace(2,6,"-----");

        System.out.println(sc.toString());

        // reverse() is used to reverse StringBuilder
        sc.reverse();

        // delete() used to delete a characters from string
        sc.delete(2,6);

        System.out.println(sc.toString());

    }
}
