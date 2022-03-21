package basics;

public class PrimeCheck {

    public static void main(String args[])
    {
        int n =25;
        
       System.out.println(checkPrime(n));
        

        
    }

    private static boolean checkPrime(int n) {


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
