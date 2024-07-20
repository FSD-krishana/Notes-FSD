package Array;

public class leaderInArray {

    //    5.Write a program to print all the Leaders in the array. An element is a Leader if it
//    is greater than all the elements to its right side. And the rightmost element is
//    always a leader.
//            Examples:
//    Input: arr[] = {16, 17, 4, 3, 5, 2}
//    Output: 17 5 2
//    Input: arr[] = {1, 2, 3, 4, 5, 2}
//    Output: 5 2
    public static void main(String[] args) {

//        int[] arr = {16, 17, 4, 3, 5, 2};
//        int[] ans = new int[arr.length];
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            boolean flag =false;
//            for (int j = i + 1; j < ans.length; j++) {
//                if (arr[i] < arr[j]) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag) {
//                ans[count] = arr[i];
//                count++;
//            }
//        }
//
//        for(int i = 0; i<ans.length;i++){
//            System.out.print(ans[i]+" ");
//        }

// 11111111111111111111111111111111111111111111111111111111111111111111
//        int[] arr = {1,2,3};
//        int n  = arr.length;
//        int ans = 0;
//
//        for(int i = 0 ;i < n ;i++){
//
//            if(i == 0){
//                if(arr[i] > arr[(i+1)]){
//                    ans = 1;
//                    break;
//                }
//            }
//            else if((n-1) ==  i ){
//                if(arr[i] > arr[(i-1)]){
//                    ans = 1;
//                    break;
//                }
//            }
//            else if(arr[i] > arr[(i+1)] && arr[i] > arr[(i-1)] ){
//                ans  = 1;
//                break;
//            }
//
//        }
//
//        System.out.println(ans);

// 222222222222222222222222222222222222222222222222222222222222
//        static Pair getMinMax(long a[], long n)
//        {
//            long min = a[0];
//            long max = a[0];
//
//            for(int i = 0; i < n ;i++){
//                if(a[i] < max){
//                    max = a[i];
//                }else if(a[i] > min){
//                    min = a[i];
//                }
//            }
//            return new Pair(max , min);
//        }
// 33333333333333333333333333333333333333333333333
//        public static String reverseWord(String str)
//        {
//            String nstr = "";
//            char ch;
//            for (int i=0; i<str.length(); i++)
//            {
//                ch= str.charAt(i);
//                nstr= ch+nstr;
//            }
//
//            return nstr;
//        }
// 444444444444444444444444444444444444444444444444444
        

    }
}
