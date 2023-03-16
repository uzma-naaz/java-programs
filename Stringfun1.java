import java.util.*;

class Stringfun1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String Enter = sc.next();
        String result = " ";

        for (int i = 0; i < Enter.length(); i++) {
            if (Enter.charAt(i) == 'i') {
                result = result + 'e';
            } else {
                result = result + Enter.charAt(i);
            }

        }
        System.out.println(result);
    }
}