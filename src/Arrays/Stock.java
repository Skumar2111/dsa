package Arrays;

public class Stock {

    public static void main(String args[]) {
        int[] arr = {1, 5, 3, 8, 12};

        maximumStockProfit(arr);
    }

    private static void maximumStockProfit(int[] arr) {

        int profit =0;

        int[] lmax = new int[10];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                profit += arr[i] - arr[i-1];
            }
        }

        System.out.println("Max profit "+profit);
    }

}
