import java.util.*;

class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of row for first matrix");
        int row1 = sc.nextInt();
        System.out.println("enter comum size for first matrix");
        int col1 = sc.nextInt();
        int array1[][] = new int[row1][col1];
        System.out.println("enter values in 1st matrix");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the size of row of 2nd matrix");
        int row2 = sc.nextInt();
        System.out.println("enter the size of column of 2nd matrix");
        int col2 = sc.nextInt();
        int array2[][] = new int[row2][col2];

        int array3[][] = new int[row1][col2];

        if (col1 != row2) {
            System.out.println("invalid matrix size");

        } else {
            System.out.println("enter values in 2nd matrix");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    array2[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    array3[i][j] = 0;
                    for (int k = 0; k < col1; k++) {
                        array3[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }
            System.out.println("product of array");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(array3[i][j] + " ");
                }

                System.out.println();
            }

        }
    }
}
