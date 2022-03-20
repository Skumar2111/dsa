package basics;

public class NumberSize {

    public static void main (String args[])
    {
        int n = 13234;
        int count =0;
        while (n>0)    // Theta (Size of number)
        {
            n = n / 10;
            count++;
        }
        System.out.println(count);

    }


}
