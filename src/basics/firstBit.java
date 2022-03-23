package basics;

public class firstBit {
    public static void main(String args[]) {
        int n=40;
        int x= (int) ((Math.log10(n & -n)) / Math.log10(2)) + 1;
        System.out.println(x);
    }
}
