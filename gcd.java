import java.util.Scanner;

class gcdd {
    public static int GcDd(int n, int m) {
        for (int i = 0; i < n; i++) {
            if (n % i == 0 || m % i == 0) {
                System.out.print(i);
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        GcDd(n, m);
    }
}