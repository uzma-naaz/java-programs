import java.util.*;

class ArrayListWater {
    public static void mostWaterBrute(ArrayList<Integer> heights) {
        int most = 0;
        for (int i = 0; i < heights.size(); i++) {
            for (int j = i + 1; j < heights.size(); j++) {
                int l1 = heights.get(i);
                int l2 = heights.get(j);
                int width = j - i;
                int ht = Math.min(l1, l2);
                int water = width * ht;
                if (water > most) {
                    most = water;
                }
            }

        }
        System.out.print("container with most water is :" + most);
    }

    public static void mostWater2pointer(ArrayList<Integer> heights) {
        int max = 0;
        int lp = 0;
        int rp = heights.size() - 1;
        while (lp < rp) {

            int wt = rp - lp;
            int ht = Math.min(heights.get(lp), heights.get(rp));
            if (heights.get(rp) < heights.get(lp)) { // a;ways look at smaller point as it decides the volume of water
                rp--;
            } else {
                lp++;
            }
            int area = wt * ht;
            max = Math.max(max, area);

        }
        System.out.println("two pointer approach gives=" + max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);
        System.out.print(heights);
        // mostWaterBrute(heights);
        mostWater2pointer(heights);
    }
}