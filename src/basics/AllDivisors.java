package basics;

public class AllDivisors {

    public static void main(String args[])
    {
        int n = 25;

        for(int i=1;i<=Math.floor(Math.sqrt(n));i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                if(i!=n/i)
                {
                    System.out.println(n/i);
                }

            }
        }

    }


}
