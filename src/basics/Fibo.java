package basics;

public class Fibo {

    public static void main(String args[])
    { int n=402;
        if(n==0)
        {
            System.out.println(5);
        }

        int result =0;
        while(n>0)
        { int mod=n%10;
            if(mod==0)
            {
                mod=5;
            }
            result = result * 10 + mod;
            n = n/10;
    }


        int ans = 0;
        while (result > 0) {
            int rem = result % 10;
            ans = ans * 10 + rem;
            result = result / 10;
        }

       // return ans;

    }
}
