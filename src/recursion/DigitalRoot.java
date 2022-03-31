package recursion;

public class DigitalRoot {

    public static void main(String args[])
    {
        int n= 9999999;
       System.out.println(digitalRoot(n));

    }

    private static int digitalRoot(int n) {

        if(n/10==0)
        {
            return n;
        }

        return digitalRoot(n%10 + (digitalRoot(n/10)));

    }

}
