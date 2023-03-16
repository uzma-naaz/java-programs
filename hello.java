
import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner td = new Scanner(System.in);

        int n = td.nextInt();
        int m = td.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                arr[i][j] = td.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }
}