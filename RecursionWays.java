class RecursionWays {
    public static void DupliString(String str, boolean map[], StringBuilder newStr, int i) {
        if (i == str.length()) {
            System.out.print(newStr);
            return;
        }
        char currStr = str.charAt(i);
        if (map[currStr - 'a'] == true) {
            DupliString(str, map, newStr, i + 1);
        } else {
            map[currStr - 'a'] = true;
            DupliString(str, map, newStr.append(currStr), i + 1);
        }
    }

    public static int FriendsPair(int n) {

        // baseCase

        if (n == 1 || n == 2) {
            return n;
        }
        // for making sinngle pair the left part left will be n-1 eg.f(2) it will give 2
        // f(3)= f(n-1)= 2 f(4)= f(3)
        // ways 4 f(3) f(2 )=2
        int singlePair = FriendsPair(n - 1);
        // for making a pair with 3 pair 2 * f(1)= 2*1= 2 3*2=6
        int DoublePair = (n - 1) * FriendsPair(n - 2);

        return singlePair + DoublePair;// total we will have 2+2 = 4 ways
    }

    public static void BinaryString(int n, String str, int lastData) {

        // baseCase
        if (n == 0) {
            System.out.println(str);
            return;
        }

        BinaryString(n - 1, str + "0", 0);
        if (lastData == 0) {
            BinaryString(n - 1, str + "1", 1);
        }

    }

    public static void AllOccur(int key, int arr[], int i) {
        // base case
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i);
        }

        AllOccur(key, arr, i + 1);

    }

    public static void DigitsToString(int n) {
        String Eng[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        if (n == 0) {
            return;
        }
        int lastD = n % 10;
        DigitsToString(n / 10);
        System.out.print(Eng[lastD] + " ");

    }

    public static int lengthofString(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return lengthofString(str.substring(1)) + 1;
    }

    public static int countSubstr(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countSubstr(str, i + 1, j, n - 1) + countSubstr(str, i, j - 1, n - 1)
                - countSubstr(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;

    }

    public static void main(String[] args) {
        // String str = "uuzzmmaaa";
        // DupliString(str, new boolean[26], new StringBuilder(" "), 0);
        // System.out.print(FriendsPair(4));
        // BinaryString(3, " ", 0);
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // AllOccur(2, arr, 0);

        // DigitsToString(2019);
        // System.out.print(lengthofString("abcd vfff"));
        String str = "aba";

        System.out.print(countSubstr(str, 0, (str.length() - 1), str.length()));
    }
}