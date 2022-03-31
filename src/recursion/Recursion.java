package recursion;

/**
 * Recursion N to 1
 */
public class Recursion {

    public static void main(String args[])
    {
        int N =5;
        printNToOne(N);

    }

    private static void printNToOne(int n) {

        if(n==0)
            return;
        else
            System.out.println(n);
            printNToOne(n-1);


    }

}
