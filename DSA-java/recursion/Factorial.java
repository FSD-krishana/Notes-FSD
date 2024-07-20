package DSA.Recursion;

public class Factorial {

    int Factorial(int x) {

        if (x == 1)
            return 1;
        return x * Factorial(x - 1);


    }

    public static void main(String[] args) {
        Factorial sc = new Factorial();

        System.out.println(sc.Factorial(10));
    }

}
