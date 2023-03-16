import java.util.*;

class ArrayQstn {

    public static boolean isMonotone(ArrayList<Integer> mono) {
        for (int i = 0; i < mono.size(); i++) {
            for (int j = i + 1; j < mono.size(); j++) {
                if (mono.get(i) <= mono.get(j)) {
                    return false;
                }
                if (mono.get(i) >= mono.get(j)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public static ArrayList<Integer> Lonely(ArrayList<Integer> mono) {
        Collections.sort(mono);
        ArrayList<Integer> lon = new ArrayList<>();
        for (int i = 1; i < mono.size() - 1; i++) {

            if (mono.get(i - 1) + 1 < mono.get(i) && mono.get(i) + 1 < mono.get(i + 1)) {
                lon.add(mono.get(i));
            }
        }
        if (mono.size() == 1) {
            lon.add(mono.get(0));
        }
        if (mono.size() > 1) {
            if (mono.get(0) + 1 < mono.get(1)) {
                lon.add(mono.get(0));
            }
            if (mono.get(mono.size() - 2) + 1 < mono.get(mono.size() - 1)) {
                lon.add(mono.get(mono.size() - 1));
            }

        }
        return lon;

    }

    public static void main(String[] args) {
        ArrayList<Integer> mono = new ArrayList<>();
        mono.add(10);
        mono.add(6);
        mono.add(5);
        mono.add(8);
        // System.out.print(isMonotone(mono));
        System.out.print(Lonely(mono));
    }
}