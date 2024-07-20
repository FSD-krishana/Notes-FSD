package Array;

public class Array_practice {
    public static void main(String[] args) {

        int[] array = {2, 3, 4, 7, 8, 0, 1};

        // ************** Max number **************
//
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.print("Max element is "+ max);

        // ******** Min Number **************

//        int min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("Minimum Number is"+ min);

        // ****************  Sum of All element in array ***************

//        int sumOfArray = 0;
//        for (int i = 0; i < array.length; i++) {
//            sumOfArray += array[i];
//        }
//        System.out.println("Sum of array element " + sumOfArray);
//
//        //*************** Product of array *******************
//
//        int productOfArray = 1;
//        for (int i = 0; i < array.length; i++) {
//            productOfArray *= array[i];
//        }
//        System.out.println("Sum of array element " + productOfArray);


        // ***************frequency of number ****************

//
//        int max = 0;
//        int maxValue = 0;
//        for (int i = 0; i < array.length; i++) {
//            int count = 0;
//
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    count++;
//                }
//            }
//            if (count > 0) {
//                max = count;
//                maxValue = array[i];
//            }
//        }
//
//        System.out.println("Max no " + maxValue);
//        System.out.println("count " + max);


        // ********************** Missing element in array *****************************

//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] + 1 != array[i + 1]) {
//                int missingElement = array[i];
//                System.out.println("Missing element is " + (missingElement + 1));
//            }
//        }


// ********************** Rotate array *****************************
//        Scanner sc = new Scanner(System.in);
//        int userInput = sc.nextInt();
//
//        for (int j = 0; j < userInput; j++) {
//            int firstElement = array[0];
//            int size = array.length;
//            for (int i = 0; i < array.length - 1; i++) {
//                array[i] = array[i + 1];
//            }
//            array[size - 1] = firstElement;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//        }

// ********************** second max Element ***********************



    }
}
