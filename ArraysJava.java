import java.util.*;

class ArraysJava {

    public static void largestNum(int numbs[], int variable[]) {
        int lar = Integer.MIN_VALUE;
        int smal = Integer.MAX_VALUE;

        for (int i = 0; i < numbs.length; i++) {
            if (lar < numbs[i]) {
                lar = numbs[i];

            }
        }
        System.out.println(lar);

        for (int i = 0; i < variable.length; i++) {
            if (smal > variable[i]) {
                smal = variable[i];
            }
        }
        System.out.println(smal);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbs[] = new int[20];
        numbs[0] = sc.nextInt();
        numbs[1] = sc.nextInt();
        numbs[2] = sc.nextInt();
        numbs[3] = sc.nextInt();

        int variable[] = { 1, 2, 4, 5, 6 };

        largestNum(numbs, variable);

    }
}