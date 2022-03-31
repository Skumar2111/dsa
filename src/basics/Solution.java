package basics;

class Solution
{
    public static long[] productExceptSelf(int nums[], int n)
    {
        long mult=1;
        long[] P = new long[n];
        for(int i=0;i<n;i++)
        {
            mult = mult * nums[i];
        }


        for(int j=0;j<n;j++)
        {
            P[j] = mult / nums[j];
        }

        return P;
    }











    }




