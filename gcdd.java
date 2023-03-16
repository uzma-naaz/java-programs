import java.util.*;

class gcdd {

    public static void GcDd(int n, int m) {
        int gcd1 = 1;
        for (int i = 0; i < n; i++) {
            if ((n % i == 0) && (m % i == 0)) {
                gcd1 = i;

            }

        }
        System.out.print(gcd1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        GcDd(n, m);
    }
}