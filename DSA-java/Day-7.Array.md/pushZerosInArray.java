package Array;

public class pushZerosInArray {
//    2. Given an array of random numbers, Push all the zeros of a given array to the
//    end of the array. For example, if the given array is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it
//    should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements
//    should be the same. Expected time complexity is O(n) and extra space is O(1).
//    Example:
//    Input : arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
//    Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
//    Input : arr[] = {1, 2, 0, 0, 0, 3, 6};
//    Output : arr[] = {1, 2, 3, 6, 0, 0, 0};

    public static void main(String[] args) {

        int[] arr = {0, 2, 0, 5, 3, 0, 5, 0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count]=arr[i];
                count++;
            }
        }
        while (count < arr.length){
            arr[count] = 0;
            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
