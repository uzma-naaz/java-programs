import java.util.Scanner;

class Basics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
         * int A = sc.nextInt();
         * int B = sc.nextInt();
         * int C = sc.nextInt();
         * 
         * float avg = (A + B + C) / 3;
         * System.out.print(avg);
         */
        /*
         * float side = sc.nextFloat();
         * float area = side * side;
         * System.out.print(area);
         */

        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // double gst = 0.18;

        // double costPencil = gst * pencil;
        // System.out.print(costPencil + pencil);

        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b *
        // y);
        // System.out.println(exp);
        int num = 342;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);

    }
}