import java.util.Scanner;

class fibon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int fib1 = 0;
        int fib2 = 1;
        for (int i = 0; i < num; i++) {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            sum = fib1;
        }
        System.out.println(sum);
    }
}