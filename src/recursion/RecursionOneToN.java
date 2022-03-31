package recursion;

public class RecursionOneToN {

    public static void main(String args[])
    {
        int N = 5;
        printOneToN(N);

    }

    private static void printOneToN(int n) {

        if(n==0)
            return;
        else
            printOneToN(n-1);
            System.out.println(n);


    }

}
