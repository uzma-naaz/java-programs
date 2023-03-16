
//bitwise operation
import java.util.*;

class bitwise {
    public static int ClearRangeofBits(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        return n & (a | b);
    }

    public static boolean PowerOf2(int n) {
        return (n & (n - 1)) == 0;

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num = 6;
        // int pos = sc.nextInt();
        // int bitmask = 1 << pos;
        // // if ((bitmask | num) == 0) {
        // // System.out.print("bit zero");

        // // } else {
        // // System.out.println("bit one");
        // int num2 = bitmask | num;
        // System.out.println(num2);
        // System.out.print(ClearRangeofBits(15, 2, 4));
        // System.out.print(PowerOf2(14));
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print((char) (ch ^ ' '));
        }

    }

}
