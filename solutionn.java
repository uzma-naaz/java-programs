class solutionn {

    public static void placement(int n, int[] arr) {
        int[] res = new int[5];
        int count = 0;
        res[0] = 0;
        for (int i = 0; i < n; i++) {
            count = 0;

            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
            res[i] = count;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 9, 10, 4, 2, 3 };
        placement(n, arr);
    }
}