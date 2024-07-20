StringBuffer in Java
Overview
StringBuffer is a mutable sequence of characters that can be modified after creation. It provides methods for appending, inserting, deleting, and modifying characters within the sequence. StringBuffer is thread-safe, meaning it can be safely used in multithreaded environments.

Key Features
Mutable: Can be modified without creating a new object, which is more efficient for string manipulation operations.
Thread-safe: Synchronized methods ensure data integrity when accessed by multiple threads.
Growable: Automatically expands its capacity as needed to accommodate new characters.
Commonly Used Methods
append(String str): Appends the given string to the end of the StringBuffer.
insert(int offset, String str): Inserts the given string at the specified offset within the StringBuffer.
delete(int start, int end): Deletes characters from the StringBuffer between the specified start and end indices.
replace(int start, int end, String str): Replaces characters within the specified range with the given string.
reverse(): Reverses the character sequence within the StringBuffer.
toString(): Converts the StringBuffer object into a String object.
Constructors
StringBuffer(): Creates an empty StringBuffer with an initial capacity of 16 characters.
StringBuffer(int capacity): Creates an empty StringBuffer with the specified initial capacity.
StringBuffer(String str): Creates a StringBuffer with the contents of the given String.
Example
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
sb.insert(5, " ");
System.out.println(sb); // Output: Hello World


--------------------------------------------------------------------------------------------------------------------------


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
