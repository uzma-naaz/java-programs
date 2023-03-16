import java.util.Scanner;

class SumDigits {
    public static void BinarySum(int a) {
        int sum = 0;

        while (a > 0) {
            int last = a % 10;
            sum = sum + last;
            a = a / 10;
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        BinarySum(a);

    }
}