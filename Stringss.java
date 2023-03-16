import java.util.*;

class Stringss {

    public static void StringCompress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) { // characters are same
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        System.out.print(sb.toString());
    }

    public static void StringLowercase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                count++;
            }
        }
        System.out.print(count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // String hello = firstName.substring(0, (firstName.length()) / 2);
        // String lastName = firstName.substring((firstName.length()) / 2,
        // firstName.length());
        // System.out.println(hello);
        // System.out.println(lastName);
        StringCompress(str);
        // StringLowercase(str);

    }
}