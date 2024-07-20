package DSA.String;

public class Strings {
    public static void main(String[] args) {
        String name = "Ashpak";                               // Static memory
        String newName = new String("Ashpak");        //  heap memory
        String name2 = "Ashpak";                             //   same memory as static veriable
        String nameName = new String("AShpak");     //   new memory


        String firstName = "NITIN";
        String lastName = "Patel";

        // String Concatination
        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));

        // String Length
        System.out.println(firstName.length());

        // charAt() is used abstract character from string
        System.out.println(lastName.charAt(3));

        // Substring()  is used to split the string
        System.out.println(firstName.substring(1, 3));

        //equals() are used to check string equal or not
        System.out.println(firstName.equals(lastName));

        // contains() checked element present or not in string

        System.out.println(firstName.contains("As"));

        // indexOf() is used to get the index of char in string
        System.out.println(firstName.indexOf('s'));

        // replace() is used to replace the char in string
        System.out.println(firstName.replace('A', 'a'));

        // Split()
        String[] ans = firstName.split("s");
        System.out.println(ans[0]);
//        System.out.println(ans[1]);


        // Write a program to reverse a string and plendrame

        String reversName = "";
        for(int i = firstName.length()-1; i >= 0  ;i--){
            reversName += firstName.charAt(i);
        }
        System.out.println("Revers String = "+reversName);

        if(firstName.equals(reversName)){
            System.out.println("is palindrome "+true);
        }
        else {
            System.out.println("is palindrome"+false);
        }


    }
}
