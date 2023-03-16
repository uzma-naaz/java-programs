import java.sql.ParameterMetaData;
import java.util.*;

class InvPyramid {

    public static void InvRot(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {

                if (j <= row - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }

    public static void InvPyrNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void FloydsTri(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + "    ");
                count++;

            }
            System.out.println();
        }
    }

    public static void ZerOneTri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }

    public static void Butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void SolRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void HollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (j == n || i == 1 || i == n || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void Diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void increment(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(i);
            }

            System.out.println();
        }

    }

    public static void patA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

                if (i == 2 && j == 5) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void PattA(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 3 || j == 1 || j == i) {
                    System.out.print(" " + "*");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // InvRot(7);
        // InvPyrNum(5);
        // FloydsTri(6);
        // ZerOneTri(5);
        // Butterfly(4);
        // SolRhombus(5);
        // HollowRhombus(5);
        // Diamond(7);
        // increment(5);
        // patA(5);
        PattA(5);
    }
}