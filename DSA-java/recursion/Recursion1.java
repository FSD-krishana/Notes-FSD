package DSA.Recursion;

public class Recursion1 {

    void  fun(int x){
        if(x==101)
            return ;
        fun(x+1);

        System.out.print(x + " ");

    }

    public static void main(String[] args) {

        Recursion1 obj = new Recursion1();
        obj.fun(1);

    }

}
