public class Subsequences {

    public static void subseq(String str, int i, String newStr) {
        if (i == str.length()) {
            System.out.print(newStr);
            return;
        }

        subseq(str, i + 1, newStr + str.charAt(i));
        subseq(str, i + 1, newStr);

    }

    public static void main(String[] args) {
        String str = "abcd";
         int index = 0;
        String newStr = " ";
        subseq(str, index, newStr);

    }
}