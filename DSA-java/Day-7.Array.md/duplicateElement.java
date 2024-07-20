package Array;

import javax.swing.plaf.IconUIResource;

public class duplicateElement {
//
//    . Given an integer array, print all distinct elements in an array. The given array
//    may contain duplicates and the output should print every element only once. The
//    given array is not sorted.
//            Examples:
//    Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
//    Output: 12, 10, 9, 45, 2
//    Input: arr[] = {1, 2, 3, 4, 5}
//    Output: 1, 2, 3, 4, 5

    public static void main(String[] args) {


        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
        int[] ans = new int[arr.length];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isFound = false;
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                ans[count] = arr[i];
                count++;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
