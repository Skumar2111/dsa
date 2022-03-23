package basics;

public class CheckBinaryElement {

    public static void main(String args[])
    {
        int N=5; // 0101
        int K=3; // 0011

        if((N & (1 << K-1))!=0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }


}
