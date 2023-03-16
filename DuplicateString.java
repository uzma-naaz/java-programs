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

    public static void main(String[] args) {
        String str = "uuzzmmaaa";
        DupliString(str, new boolean[26], new StringBuilder(" "), 0);
    }
}