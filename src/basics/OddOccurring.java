package basics;

public class OddOccurring {

    public static void main(String args[])
    {
        int[] arr = {1, 2, 4, 2, 1};

        int result =0;

        for(int i=0;i<arr.length;i++)
        {
            result = result ^ arr[i];
        }

        System.out.println(result);

    }


}
