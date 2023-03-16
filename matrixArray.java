import java.util.*;

class matrixArray {
    public static void SpiralArray(int arr[][]) {
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // top

            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(arr[rowStart][i] + " ");
            }

            // right
            for (int j = rowStart + 1; j <= rowEnd; j++) {
                System.out.print(arr[j][colEnd] + " ");
            }
            // bottom
            for (int i = colEnd - 1; i >= colStart; i--) {
                if (colStart == colEnd) {
                    break;
                }
                System.out.print(arr[rowEnd][i] + " ");
            }
            // right
            for (int j = rowEnd - 1; j >= rowStart + 1; j--) {
                if (rowStart == rowEnd) {
                    break;
                }
                System.out.print(arr[j][colStart] + " ");
            }
            System.out.println();
            colStart++;
            colEnd--;
            rowStart++;
            rowEnd--;
        }

    }

    public static void DiagonalSum(int arr[][]) {
        int sum = 0;
        // for(in t i = 0 ;i<arr.leng th;i ++){
        // for(in t j = 0 ;j<arr[0].leng th;j ++){
        // i f( i==j | | i+ j==arr.len g th -1){
        // sum+= arr[i][j];
        //

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if (i != arr.length - 1 - i)
                ;

            sum += arr[i][arr.length - 1 - i];

        }
    }

    public static void SearchInMatrix(int key, int arr[][]) {
        int row = arr.length - 1;
        int col = 0;
        int count = 0;

        while (row != col) {
            if (arr[row][col] == key) {

            }
            if (key > arr[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        count++;
        System.out.print(count);
    }

    public static void SumofSecond(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[1][i];
        }
        System.out.print(sum);
    }

    public static void TransposeOfMatrix(int arr[][]) {
        int transpose[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[i][j]= arr[j][i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 7, 11, 12 },
                { 13, 14, 7, 16 } };
        // SpiralArray(arr);
        // System.out.prin t(DiagonalSum(arr));
        // SearchInMatrix(7, arr);
        // SumofSecond(arr);
        TransposeOfMatrix(arr);
    }
}