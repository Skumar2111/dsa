package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class MaximumOfSubarray {

    public static void main(String args[]) {
        int arr[] = {-3, 8, -2, 4, -5, 6};

        System.out.println(findMaxSum(arr));

    }

    private static int findMaxSum(int[] arr) {

        int result = arr[0];
        int maxEnd = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            maxEnd = Math.max(maxEnd + arr[i],arr[i]);
            result = Math.max(result,maxEnd);

        }

        return result;
    }
}
