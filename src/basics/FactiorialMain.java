package basics;

public class FactiorialMain {

    public static void main(String args[])
    {
        Factorial factorial = new Factorial();

 //       int fact = factorial.calculateFactorialRecursive(5);
        int fact = factorial.calculateFactorialIterative(10);

        System.out.println(fact );


    }

}


class Factorial
{

    public int calculateFactorialRecursive(int i) {

        if(i==0)return 1;

        System.out.println(i +" and " +(i-1)+"!");
        return i * calculateFactorialRecursive(i-1);

    }

    public int calculateFactorialIterative(int n) {
        int fact=0;
        if(n>0) {
            fact = 1;
        }
        for(int i=2;i<=n;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
}
