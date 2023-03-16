import java.util.Scanner;

class Solution {
    public static void RevName(String n, int i) {

        if (i == 0) {
            System.out.println(n.charAt(0));
            return;
        }
        System.out.print(n.charAt(i));
        RevName(n, i - 1);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int ind = name.length() - 1;
        RevName(name, ind);

    }
}
