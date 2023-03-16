class Searching {
    public static void linearSearch(int key, int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.print(i);

            }
        }
    }

    public static int BinarySearch(int key, int array[]) {
        int start = 0;
        int end = array.length;

        while (start <= end) {
            int mid = (end + start) / 2;
            if (key == array[mid]) {
                return mid;
            } else if (key < array[mid]) {
                end = mid - 1;
            } else if (key > array[mid]) {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static int[] ReverseArr(int array[]) {
        int first = 0;
        int last = array.length - 1;

        while (first < last) {
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;
            first++;
            last--;
        }

        return array;
    }

    public static void PairsArr(int array[]) {
        int tp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print(array[i] + "," + array[j] + " ");
                tp++;
            }
            System.out.println();

        }
        System.out.print("total pairs = " + tp);
    }

    public static void SubArr(int array[]) {
        int totalsub = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print("(" + array[k] + " )");
                    sum += array[k];// sum of subarrays

                }
                if (max < sum) {
                    max = sum;
                }
                totalsub++;
                System.out.println();
                System.out.println("sum= " + sum);

            }
        }
        System.out.println("maxSum of subarray is:" + max);// max subarray has time complexity n^3 called brute force

    }

    public static void PrefixSub(int array[]) {

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (max < sum) {
                    max = sum;
                }
            }

        }
        System.out.println(max);
    }

    public static void kadanesAlgo(int array[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (sum < 0) {
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        System.out.print(max);
    }

    public static void main(String args[]) {
        int array[] = new int[4];
        array[0] = 5;
        array[1] = 7;
        array[2] = 8;
        array[3] = 10;

        // linearSearch(10, array);
        // System.out.print(BinarySearch(1 0, array));
        // ReverseArr(array);
        // for (int i = 0; i < array.length; i++) {
        // System.out.print(array[i] + " ");
        // PairsArr(array);
        // SubArr(array);
        // PrefixSub(array);
        kadanesAlgo(array);
    }

}
