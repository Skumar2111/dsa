package Arrays;

class Solution{

    public  static void main(String args[])
    {
        int arr[] = {6, 1, 8, 9, 2, 7, 9, 5, 4, 3};
        trappingWater(arr,10);
    }

     static long trappingWater(int arr[], int n) {
        // Your code here

        long result = 0;
        int[] lmax = new int[n];
        int[] rmax = new int[n];


        lmax[0] = arr[0];
        rmax[n-1] = arr[n-1];
        for(int i = 1; i< n ; i++)
        {
          lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }

        for(int j=n-2;j>=0;j--)
        {

          rmax[j] =  Math.max(rmax[j + 1], arr[j]);
        }


        for(int k=1;k<n-1;k++)
        {
           result = result + Math.min(lmax[k], rmax[k]) - arr[k];
        }
        return result;

    }
}