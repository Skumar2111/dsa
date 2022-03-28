package recursion;

public class TowerOfHanoi {

    public static void main(String args[])
    {

        int n=5;
        printHanoi(n,'A','C','B');

    }

    private static void printHanoi(int n, char from, char to, char aux) {

        if(n==1)
        {
            System.out.println("Move disk 1 from "+from+" to "+to);
            return;
        }

        printHanoi(n-1,from,aux,to);
        System.out.println("Move disk "+n+" from rod "+from+" to Rod "+to);
        printHanoi(n-1,aux,to,from);


    }
}
