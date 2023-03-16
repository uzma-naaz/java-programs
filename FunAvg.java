import java.util.*;

class FunAvg {
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(isEven(num));
    }

    // public static int methAvg(int a, int b, int c) {
    // int sum = a + b + c;
    // int avg = sum / 3;
    // return avg;
    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();

    // System.out.print(methAvg(a, b, c));
    // }

}