package Array;

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

//        int[] marks = {720, 640, 550, 450, 284, 234, 342, 2344, 1234};
//
//        for (int i = 0; i < marks.length; i++) {
//            System.out.print(" " + marks[i]);
//        }
//        for (int i = 2; i < marks.length - 1; i++) {
//            marks[i] = marks[i + 1];
//        }
//
//        System.out.println("   ");
//
//        for (int i = 0; i < marks.length; i++) {
//            System.out.print(" " + marks[i]);
//        }
//
//        System.out.println("   ");
//
//        System.out.println("Enter the no of Student : = ");
//        int n = sc.nextInt();
//
//        int[] newArray = new int[n];
//        System.out.println("Enter marks of Student : = ");
//
//        for (int i = 0; i < n; i++) {
//            int studentMarks = sc.nextInt();
//            newArray[i] = studentMarks;
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(newArray[i]);
//        }

        // program to search element in aarray


        System.out.println("program to search element in aarray");
        int[] array = {6554, 454, 454, 45, 5, 45};
        int userInput = sc.nextInt();
        boolean isfound = false;


        for(int i = 0 ;i < array.length;i++){
            if(array[i] == userInput) {
                System.out.println("Element Found");
                isfound = true;
                break;
            }
        }

        if(!isfound){
            System.out.println("Element not Found");
        }

//    // program to find all the even number in array
        System.out.println("program to find all the even number in array");
        for(int i = 0 ;i < array.length;i++){
            if(array[i] % 2 == 0) {
                System.out.print(array[i]+ "  ");
            }
        }



//        int[] marks = {720, 640, 720, 450, 720, 450, 342, 450, 450, 450};
//
//        int count = 1;
//        int max = 0;
//        int maxValue = 0;
//        for (int i = 0; i < marks.length; i++) {
//            for (int j = i + 1; j < marks.length; j++) {
//                if (marks[i] == marks[j]) {
//                    count++;
//                }
//            }
//            if (count >= 0) {
//                max = count;
//                maxValue = marks[i];
//                System.out.println("Max Count " + max);
//                System.out.println("Max no" + maxValue);
//            }
//            count = 0;
//        }


        

    }
}
