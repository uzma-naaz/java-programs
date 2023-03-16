import java.util.*;

public class List1 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();

        name.add("hello");
        name.add("uzma");

        name.get(1);

        name.add(1, "you");
        name.set(1, "me");

        name.remove(2);

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }

        Collections.sort(name);

        System.out.println(name.size());

        System.out.println(name);

    }
}