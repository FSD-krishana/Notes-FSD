package Array;

import java.util.Scanner;

public class ArraySnake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" #################################");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
