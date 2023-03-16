import java.util.*;

class Bills {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();
        int[] arr = new int[person];
        for (int i = 0; i < person; i++) {
            arr[i] = sc.nextInt();
        }
        splitbill(arr, person);
    }

    public static void splitbill(int[] arr, int person) {

        int sum = 0;

        for (int i = 0; i < person; i++) {
            sum += arr[i];

        }
        float avgBill = (float) sum / person;
        System.out.print(avgBill);
        double[] amount = new double[person];
        Arrays.fill(amount, avgBill);
        for (int i = 0; i < person; i++) {
            System.out.println("person" + (i + 1) + "is" + amount[i]);
        }
        double[] amountowedbyperson = new double[person];
        double[][] debts = new double[person][person];
        for (int i = 0; i < person; i++) {
            for (int j = 0; j < person; j++) {
                if (i != j) {
                    debts[i][j] = sc.nextDouble();
                }
            }
            amountowedbyperson[i] = amount;

        }
        // double amntowe = amount;
        for (int i = 0; i < person; i++) {
            double amntowe = amount;
            for (int j = 0; j < person; j++) {
                if (i != j) {
                    amntowe += debts[j][i] - debts[i][j];
                }
            }
        }

        for (int i = 0; i < person; i++) {
            for (int j = 0; j < person; j++) {
                if (i != j) {
                    double debt1 = debts[i][j];
                    double debt2 = debts[j][i];
                    if (debt1 > debt2) {
                        debts[i][j] = debt1 - debt2;
                        debts[j][i] = 0;
                        amountowedbyperson[j] -= debt2;
                        amountowedbyperson[i] += debt2;
                    } else if (debt2 > debt1) {
                        debts[i][j] = 0;
                        debts[j][i] = debt2 - debt1;
                        amountowedbyperson[i] -= debt1;
                        amountowedbyperson[j] += debt1;
                        System.out.print("person" + (i + 1) + "owes person" + (j + 1) + "rs" + debt1);

                    }
                }
            }
        }
    }
}