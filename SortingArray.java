class SortingArray {
    public static void BubbleSort(int arr[]) {
        int swap = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
        }
        System.out.println(swap);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 9, 4, 5 };
        // BubbleSort(arr);
        SelectionSort(arr);
    }
}