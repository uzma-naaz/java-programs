import java.util.Scanner;

class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);

        switch (alpha) {
            case 'a':
                System.out.println("a is an alphabet");
                break;

            case 'e':
                System.out.println("e is an alphabet");
                break;
            case 'i':
                System.out.println("i is an alphabet");
                break;
            case 'o':
                System.out.println("o is an alphabet");
                break;
            case 'u':
                System.out.println("u is an alphabet");
                break;
            default:
                System.out.println("this is not an alphabet");
        }
    }
}