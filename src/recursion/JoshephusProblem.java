package recursion;

public class JoshephusProblem {

    public static void main(String args[])
    {
        int N =11;
        int K =2;
        System.out.println(solveJosephus(N,K));
    }

    private static int solveJosephus(int n, int k) {

        if(n==1)
        {
            return 0;
        }

        return (solveJosephus(n-1,k)+k)%n;


    }

}
