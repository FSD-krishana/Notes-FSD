
StringBuilder and StringBuffer in Java
Overview
StringBuilder and StringBuffer are both mutable classes that provide an alternative to the immutable String class by creating mutable sequences of characters. They are similar in function but have key differences:

Synchronization:

StringBuffer is synchronized and thread-safe, making it suitable for use in multithreaded environments.
StringBuilder is not synchronized and should be used in single-threaded environments.
Speed:

StringBuilder is faster than StringBuffer.
Use Cases:

StringBuilder is preferred for single-threaded programs and efficient string manipulation.
StringBuffer is better for thread safety in multithreaded environments.
StringBuilder
What is it?
A mutable sequence of characters, meaning you can modify its content after creation, unlike Strings which are immutable. It is used for dynamically building strings, especially when performance is a concern.

Key Advantages
Efficiency: Appending to a StringBuilder is much faster than concatenating Strings with the + operator, especially for a large number of operations.
Flexibility: Offers various methods for inserting, deleting, replacing, and appending characters or substrings.
Commonly Used Methods
append(String str): Appends the specified string to the end of the sequence.
insert(int offset, String str): Inserts the specified string at the specified index.
delete(int start, int end): Deletes characters from the sequence.
replace(int start, int end, String str): Replaces characters in the sequence with the specified string.
reverse(): Reverses the sequence of characters.
toString(): Converts the StringBuilder object to a String object.
Constructors
StringBuilder(): Creates an empty StringBuilder with an initial capacity of 16 characters.
StringBuilder(int capacity): Creates an empty StringBuilder with the specified capacity.
StringBuilder(String str): Creates a StringBuilder initialized with the contents of the specified string.
Example
StringBuilder sb = new StringBuilder("Hello");
sb.append(" ");
sb.append("World");
sb.insert(5, ",");
System.out.println(sb.toString()); // Output: Hello, World






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
