public class RecursionBasic {
    public static void IncOrd(int n) {
        if (n == 1) { // base class , where to stop the recursion
            System.out.println(n);
            return;
        }

        IncOrd(n - 1); // inner recursion
        System.out.print(n + " "); // what we need to do and starting of recursion
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) { // base class

            return 1;
        }

        return n * fact(n - 1);

    }

    public static int sumOfNatural(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNatural(n - 1);
    }

    public static int fibon(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fibon(n - 1) + fibon(n - 2);

    }

    public static void main(String[] args) {
        int n = 100;
        // IncOrd(n);
        // System.out.print(fact(n));
        // System.out.print(sumOfNatural(n));
        System.out.print(fibon(n));
    }

}
