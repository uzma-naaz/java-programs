
// Write a program input three numbers to find out greatest using nested if
// statements
import java.util.Scanner;

class greatestIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1>num3) {
            System.out.println("num1 is greater");
        } else if (num2 > num3 && num2>num1) {
            System.out.println("num2 is greatest");
        } else {
            System.out.println("num 3 is greater");
        }
    }
}