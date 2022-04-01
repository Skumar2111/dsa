package Arrays;

public class ReverseArray {


    public static void main(String args[])
    {
        int[] arr = {1,2,3,5,6};

        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {

        int temp = 0;
        for(int i=0;i<arr.length/2;i++)
        {
            temp = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp;
        }
    }
}
