package basics;

public class oddOcurringTwo {

    public static void main(String args[]) {
        int[] arr = {1, 2, 8, 32, 2, 1,};

        int result = 0;
        int res1=0;
        int res2=0;

        for (int i=0;i<arr.length;i++)
        {
            result = result ^ arr[i];
        }

        int sn = result & ~(result-1);

        for(int i=0;i<arr.length;i++)
        {
            if(((arr[i]&sn) !=0))
            {
                res1= res1^arr[i];
            }
            else
            {
                res2= res2^arr[i];
            }
        }


System.out.println(res1+","+res2);
    }
}
