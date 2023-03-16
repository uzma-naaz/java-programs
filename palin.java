class palin {
    public static void main(String[] args) {
        int[] a = { 111, 222, 333 };
        int r = 0;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            while (temp > 0) {
                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;
            }
            if (a[i] != sum) {
                System.out.print(a[i] + "is palindrome");
            } else {
                System.out.println(a[i] + "not palindrome");
            }

        }

    }
}
