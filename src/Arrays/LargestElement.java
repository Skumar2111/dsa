package Arrays;

import java.util.ArrayList;

public class LargestElement {

    public static void main(String args[])
    {
        int[] arr = {10,20,30,21};

        System.out.println(findLargest(arr));



    }

    private static int findLargest(int[] arr) {
        int max = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]>max)

            {
                max =arr[i];
            }

        }

        return max;


    }

}
