package basics;

public class PowerSet {


    public static void main(String args[])
    {

    String str = "abc";
    String[] str1 = str.split("");
    int len = str.length();

    int pow = (int) Math.pow(2,len);

    for(int i=0;i<pow;i++)
    {
        for(int j=0;j<len;j++)
        {
            if((i & (1<<j))>0)
            {
                System.out.print(str1[j]);
            }
            }
        System.out.println();
    }


    }


}
