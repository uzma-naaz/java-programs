import java.util.*;

class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        float tax = 0; // int tax;

        if (income < 500000) {
            System.out.print(tax = 0);
        } else if (income >= 500000 && income < 10000000) {
           // tax = //income * 0.2f; 
            tax=  (int)(income*0.2);
            System.out.print(tax);
        } else if (income > 10000000) {
            tax = income * 0.3f;
            System.out.print(tax);
        }

    }
}