import java.util.*;

class FarmerField {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] incomeTable = new int[n][n];
        System.out.print("enter value in income");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                incomeTable[i][j] = sc.nextInt();
            }

        }

        int midRow = n / 2;
        int midCol = n / 2;
        int rowprofit = 1;
        int colprofit = 1;

        for (int i = 0; i < n; i++) {
            rowprofit *= incomeTable[midRow][i];
        }
        for (int i = 0; i < n; i++) {
            colprofit *= incomeTable[i][midCol];
        }
        int totalprofit = colprofit + rowprofit;
        System.out.println("profit" + totalprofit);
        int expenditure = 0;
        int prf = totalprofit;

        while (prf > 0) {
            expenditure = expenditure * 10 + prf % 10;
            prf = prf / 10;
        }
        System.out.println("exp" + expenditure);
        int investement = totalprofit - expenditure;
        System.out.println(investement);
    }

}