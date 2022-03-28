package recursion;

public class SumDigits {

    public static void main(String args[])
    {

        int a = 88989882;

        System.out.println(calcSum(a));


    }

    private static int calcSum(int a) {

        if(a==0)
        return 0;
        else
        {
            return a%10 + calcSum(a/10);
        }


    }

}
