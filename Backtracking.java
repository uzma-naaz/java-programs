class Backtracking {
    public static void ChangeArr(int arr[], int i, int val) {

        // base case
        if (i == arr.length) {
            // printArr(arr);
            return;
        }
        arr[i] = val;
        ChangeArr(arr, i + 1, val + 2);
        arr[i] = arr[i] - 1; // backstracking

    }

    public static void Subset(String str, String res, int i) {
        // base case

        if (i == str.length()) {
            if (res.length() == 0) {
                System.out.print("null");
            }
            System.out.println(res);
            return;
        }
        // recursion
        Subset(str, res + str.charAt(i), i + 1); // choice if that character wants to go then add to the result
        Subset(str, res, i + 1); // if that character does not want to go

    }

    public static void Permutation(String str, String res) {
        // base case
        if (str.length() == 0) {
            System.out.print(res);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newS = str.substring(0, i) + str.substring(i + 1); // we are omitting current char value
            Permutation(newS, res + curr);
        }
    }

    public static int RatInMaze(int arr[][], int i, int j) {
        // base case
        if (i < arr.length && j < 4) {
            return 1;
        }
        if (i == 4 && j == 4) {
            return 0;
        }

        // up
        int U = RatInMaze(arr, i, j - 1);
        // down
        int D = RatInMaze(arr, i, j + 1);
        // right
        int R = RatInMaze(arr, i + 1, j);
        // left
        int L = RatInMaze(arr, i - 1, j);
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < 4; n++) {
                if (arr[m][n] == 0) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
        return U + D + R + L;

    }

    public static void main(String args[]) {
        // int arr[] = new int[6];
        // int i = 0;
        // int val = 1;
        // // ChangeArr(arr, i, val);
        // // for (i = 0; i < arr.length; i++) {
        // // System.out.print(arr[i]);
        // // }

        // find subset- abc= a,b,c,ab,bc,cb,abc,null

        // Subset("abc", "", 0);
        // Permutation("abc", " ");
        int arr[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        System.out.print(RatInMaze(arr, 0, 0));

    }
}