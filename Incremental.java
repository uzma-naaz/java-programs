import java.util.Scanner;

class Incremental {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int len = 0;
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length() - 1; j++) {

                if (name.charAt(i) != name.charAt(j)) {
                    len++;

                }
            }
        }
        System.out.print(len);

    }
}
