package basics;

public class PowerOfTwo {

    public static void main(String args[])
    {
        int N = 6;

        if((N&N-1)==0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }


    }

}
