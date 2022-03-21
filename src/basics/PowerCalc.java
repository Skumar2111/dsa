package basics;

public class PowerCalc
{
    public static  void main(String args[])
    {   int x= 5;
        int n= 6;
        Power power = new Power();

        System.out.println(power.calculatePower(x,n));
    }
}

class Power
{

    public int calculatePower(int x, int n) {

        if(n==0)
        {
            return 1;
        }
        if(n%2==0)
        {
          int temp = calculatePower(x,n/2);
          System.out.println(temp);
         return temp = temp * temp;
        }
        else
        {
            int temp = calculatePower(x,n-1)*x;
            return temp;
        }
    }
}
