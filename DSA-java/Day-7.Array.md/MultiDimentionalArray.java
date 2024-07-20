package Array;

import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row ");
        int m = sc.nextInt();
        System.out.println("Enter Column ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];

        int a = arr.length;
        int sum = 0;

        for(int i = 0; i < m ;i++){
            for(int j = 0 ; j < arr[i].length;j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println("Ans : = " + sum);
    }
}
