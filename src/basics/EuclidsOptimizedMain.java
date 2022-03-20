package basics;

public class EuclidsOptimizedMain {

    public static void main(String args[])
    {
        int m =10;
        int n=15;

        EuclidsOptimized eo = new EuclidsOptimized();


        System.out.println(eo.optimizedEuclids(m, n));

    }
}

class EuclidsOptimized
{


    public int optimizedEuclids(int m, int n) {
        if(n==0) {
            return m;
        }
        else {
            return optimizedEuclids(n, m % n);
        }

    }
}


