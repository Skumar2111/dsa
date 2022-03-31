package recursion;

/**
 * String palindrome using recursion
 */
public class StringPalindrome {



    public static void main(String args[])
    {
        String s = "geeks";
        char[] sa = s.toCharArray();
        System.out.println(calcPallindrome(sa,0,sa.length-1));
    }

    private static boolean calcPallindrome(char[] charArr,int init,int end) {

        if(init >= end)
        {
            return true;
        }


        if(charArr[init]==charArr[end])
        {
            return calcPallindrome(charArr,init+1,end-1);
        }
        else
        {
            return false;
        }

    }
}
