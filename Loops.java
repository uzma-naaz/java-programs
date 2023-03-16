import java.util.*;

class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int even = 0;
        int odd = 0;
        do {
            int n = sc.nextInt();
            if (n % 2 == 0) {

                even = even + n;

            }

            else {
                odd = odd + n;

            }
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("even");
        System.out.println("odd");

    }

    // }
    // System.out.println(even);
    // System.out.print(odd);
    // int fact = 1;
    // for (int i = 1; i <= n; i++) {
    // fact = fact * i;
    // }
    // System.out.print(fact);

    // for (int i = 1; i <= 10; i++) {
    // int table = n * i;
    // System.out.println(n + "x" + i + " = " + table);
    // }
    // System.out.print(i);

}
