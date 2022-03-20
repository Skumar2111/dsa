package basics;

public class TrailingZero {

    public static void main(String args[])
    {
        int n = 10;
        int res = 0;
        for(int i=5;i<n;i=i*5)
        {
            System.out.println(n/i);
            res = res+n/i;
        }

        System.out.println(res);
    }
}
