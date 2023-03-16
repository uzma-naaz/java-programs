import java.util.Scanner;

class Fact {
    public static int facto(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return (n * facto(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(facto(n));

    }

}
