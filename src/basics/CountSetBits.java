package basics;

public class CountSetBits {

    public static void main(String args[])
    {
        int N = 5600;
        int count = 0;
        while(N!=0)
        {
            N = N&(N-1);
            count ++;
        }
       System.out.println(count);

    }
}
