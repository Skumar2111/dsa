package basics;

public class ArrayOccuranceOdd {

    public static void main(String args[])
    {
        int[] arr = {1,2,2,3,1,3,6,4};
        int res=0;
        int res1=0;
        int res2=0;
        for(int i=0;i<arr.length;i++)
        {
            res = res ^ arr[i];
        }

        int sn = res & ~(res-1);

        for(int i=0;i<arr.length;i++)
        {
            if((sn&arr[i])!=0)
            {
                res1 = res1 ^ arr[i];
            }
            else
            {
                res2= res2 ^ arr[i];
            }
        }

        System.out.println(res1+","+res2);

    }
}
