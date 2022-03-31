package recursion;

public class SubsetSum {

    public static void main(String args[])
    {
        int[] arr = {5,10,15};
        int N = 3;
        int sum = 25;
        System.out.println(subsetSum(arr,N,sum));
    }

    private static int subsetSum(int[] arr, int n, int sum) {

        if(n==0)
        {
            return (sum==0)?1:0;
        }

        return subsetSum(arr,n-1,sum) + subsetSum(arr,n-1,sum-arr[n-1]);
    }

}
