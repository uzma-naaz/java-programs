import java.util.*;

class FunPalin {
    public static void paliNum(int num) {
        int n = num;
        int rev = 0;
        while (n > 0) {
            int last = n % 10;
            rev = rev *10 + last;
            n = n / 10;
        }

        if (num == rev) {
            System.out.print("is palindrome");
        } else {
            System.out.print("not palindrome");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        paliNum(num);

    }
}