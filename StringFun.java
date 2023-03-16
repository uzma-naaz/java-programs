
// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.Scanner;

class StringFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ArrayOfStr[] = new String[n];
        int totalStr = 0;

        for (int i = 0; i < n; i++) {
            ArrayOfStr[i] = sc.next();

            totalStr = totalStr + ArrayOfStr[i].length();

        }
        System.out.println(totalStr);
    }
}