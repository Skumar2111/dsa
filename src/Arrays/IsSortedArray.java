package Arrays;

public class IsSortedArray {

    public static void main(String args[])
    {
        int[] arr = {10,20,30,40};

       System.out.println(isSortedArray(arr));


    }

    private static boolean isSortedArray(int[] arr) {

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }

        }

        return true;


    }


}
