import java.util.Scanner;

class patt {
    public static void main(String[] args) {
        Scanner but = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = but.nextInt();
        int b = but.nextInt();
        System.out.println("enter any operator to calculate");
        char calc = but.next().charAt(0);
        switch (calc) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("NO NO");

        }
    }
}