class PrefixStr {
    public static void main(String[] args) {
        String strs[] = { "flower", "flight", "flood" };
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                    System.out.print("equal");
                } else {
                    System.out.print("not equal");
                }
                System.out.print(" ");

            }

        }
    }

}
