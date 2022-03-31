public class RunLengthEncoding {

    public static void main(String args[])
    {
        String s = "abbbc";
        lengthEncode(s.toCharArray());

    }

    private static void lengthEncode(char[] toCharArray) {
        int count =0;
        String newString = "";
        for(int i=1;i<toCharArray.length;i++)
        {
            if(toCharArray[i-1]==toCharArray[i])
            {
                count++;
            }
            else if( toCharArray[i-1]!=toCharArray[i])
            {
                if(count > 0)
                {
                    newString = newString + toCharArray[i-1] + count;
                }
                else {
                    newString = newString + toCharArray[i];
                    count = 0;
                }
            }
        }

        System.out.println(newString);


    }
}
