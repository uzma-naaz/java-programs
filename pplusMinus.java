import java.util.*;

class pplusMinus {

    public static void plusMinus(List<Integer> arra) {
        // Write your code here
        int zero = 0;
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < arra.size(); i++) {
            if (arra.get(i) == 0) {
                zero++;

            }
            if (arra.get(i) > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        double zeroDeci = zero / arra.size();
        double posDeci = pos / arra.size();
        double negDeci = neg / arra.size();
        System.out.println(String.format("%.6f", zeroDeci));
        System.out.println(String.format("%.6f", posDeci));
        System.out.println(String.format("%.6f", negDeci));

    }

    public static void main(String args[]) {

        List<Integer> arra = new List<Integer>();
        arra.add(1);
        arra.add(-1);
        arra.add(0);
        arra.add(2);
        arra.add(3);
        arra.add(-2);
        plusMinus(arra);

    }

}
