import java.util.*;

class PairSumArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int l1 = list.get(i);
                int l2 = list.get(j);
                if (l1 + l2 == 5) {
                    System.out.println("the sum is formed with" + l1 + "and" + l2);
                }
            }
        }
        // sorted
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == 5) {
                System.out.print(lp + "," + rp);
            }
            if (list.get(lp) + list.get(rp) < 5) {
                lp++;
            } else {
                rp--;
            }
        }
    }
}