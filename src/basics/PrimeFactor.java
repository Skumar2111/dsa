package basics;

public class PrimeFactor{

    public static void main(String args[])
    {
        int n = 345;
        checkPrimeFactors(n);

    }

    private static void checkPrimeFactors(int n) {

        for(int i =2;i<=Math.floor(Math.sqrt(n));i++)
        {
            if(isPrime(i))
            {
                while(n%i==0)
                {
                    n = n/i;
                    System.out.println(i);

                }

            }

        }
        if(n>1)
        {
            System.out.println(n);
        }


    }

    private static boolean isPrime(int n) {

        for(int i=2;i<Math.floor(Math.sqrt(n));i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
