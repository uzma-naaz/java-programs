class RecurTiling {
    public static int TilingProb(int n) {

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        int vertiArrang = TilingProb(n - 1);
        int horiArrang = TilingProb(n - 2);

        return vertiArrang + horiArrang;
    }

    public static void main(String[] args) {
        // tling probl for 2xn board
        TilingProb(3);

    }
}
