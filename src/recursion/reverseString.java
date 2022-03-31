package recursion;

public class reverseString {

    public static void main(String args[])
    {
        String s=  "abacd";
        flipString(s.toCharArray(),s.toCharArray().length-1);

        Math.log10((int)999);
    }

    private static void flipString(char[] toCharArray, int index) {

        if(index<0)
        {
            return;
        }

        System.out.println(toCharArray[index]);
        flipString(toCharArray , index-1);


    }
}
