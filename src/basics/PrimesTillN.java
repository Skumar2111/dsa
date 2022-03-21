package basics;

public class PrimesTillN {

    public static void main(String args[])
    {
        int n = 500;

        boolean[] arr = new boolean[n+1];

        for(int i=0;i<=n;i++)
        arr[i]=true;

        arr[0]= false;
        arr[1]=false;

        for(int j=2;j*j<=n;j++)
        {

            if(arr[j]==true)
            {
                for(int k= j*j;k<=n;k+=j)
                {
                    arr[k]=false;

                }
            }

        }

        for(int i =0;i<n;i++)
        {
            if(arr[i]==true)
            {
                System.out.println(i);
            }
        }
        }


}
