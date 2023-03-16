import java.util.Scanner;

class fibo {
    public static int fiboNum(int n) {
        int n1 = 0;
        int n2 = 1;
        int fib = 0;
        for (int i = 1; i < n; i++) {
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fiboNum(n));

    }
}