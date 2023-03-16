import java.util.Scanner;

class Numbers {
    public static void EligibleVote(int a, int b) {
        int powE = 1;
        for (int i = 1; i <= b; i++) {
            powE = a * powE;
        }
        System.out.print(powE);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        EligibleVote(n, x);

    }
}
