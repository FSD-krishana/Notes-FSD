package DSA.Recursion;

public class FibonaciSereas {


    int Fibonaci(int num, int a, int b) {
        if (num == 1)
            return 1;
        int sum = a + b;
        a = b;
        b = sum;
        System.out.println(sum);
        return Fibonaci(num - 1, a, b);
    }

    public static void main(String[] args) {

//        int a = 0;
//        int b = 1;
//        int num =0;
//        for(int i = 2 ; i <= 10; i ++){
//
//            num = a+b;
//            System.out.println(num);
//            a = b;
//            b = num;
//        }

        FibonaciSereas sc = new FibonaciSereas();
        System.out.println(0);
        System.out.println(1);
        sc.Fibonaci(10, 0, 1);
    }

}
