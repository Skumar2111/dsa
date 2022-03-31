package basics;

import static java.util.Arrays.binarySearch;

public class BinarySearch {

    public static void main(String args[])
    {
        int[] arr = {1 ,1 ,1 ,1, 1, 1, 1, 1, 1, 0, 0, 0};
        int N=12;


        System.out.println(doBinarySearch(arr,0,N-1));


    }

    private static int doBinarySearch(int[] arr, int low , int high) {

        if(high >= low)
        {
            int mid = low + (high - low)/2;
            if((mid==0 || arr[mid-1]==1)&& arr[mid]==0)
            {
                return mid;
            }

            if(arr[mid]==1)
            {
               return doBinarySearch(arr,(mid+1),high);
            }
                else
            {
              return doBinarySearch(arr,low,(mid-1));
            }
        }
        return -1;


    }


}
