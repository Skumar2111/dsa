package basics;

public class LCMMain {

    public static void main(String args[])
    {

        int a = 4;
        int b = 6;

        LCM lcm = new LCM();
        System.out.println(lcm.calculateLCM(a,b));


    }

}

class LCM
{

    public int calculateLCM(int a, int b) {
        int lcm = (a*b)/gcd(a,b);
        return  lcm;
    }

    private int gcd(int a, int b) {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,b%a);
        }

    }
}