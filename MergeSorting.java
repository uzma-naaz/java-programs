class MergeSorting {

    public static String[] MergeSort(String arr[], int si, int ei) {
        //base case- starting and ending is same so just return that element in array
        if (si == ei) {
            String A[] = { arr[si] };
            return A;
        }
        // we need to divide the array so take the mid point
        int mid = (si + ei) / 2; //this is work mid we take out for every half part of array
        //calling function of sorting the two arrays
        String arr1[] = MergeSort(arr, si, mid); // first array from starting to mid
        String arr2[] = MergeSort(arr, mid + 1, ei); // after mid to end

        String arr3[] = merge(arr1, arr2); //after sorting we need to now merge it in a diff array
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        //merging the two arrays
        int x = arr1.length;  //half array 
        int y = arr2.length; //another half

        String[] arr3 = new String[x + y]; //declaring size of third array where we are mering which is equal to length of both
        int index = 0; //iterator for third array
        int i = 0; // iterator for first array
        int j = 0; //iterator for 2nd arrray
        while (i < x && j < y) { // do until i & j are less than length of array
            if (isalpha(arr1[i], arr2[j])) { //check function for which is smaller
                arr3[index] = arr1[i]; //if true then store first arrays first position in third array
                i++;  
                index++;
            } else {
                arr3[index] = arr2[j]; // if not then arr3 at 0 have value of next array
                j++;
                index++;
            }
        }
        while (i < x) {
            arr3[index] = arr1[i];
            i++;
            index++;

        }
        while (j < y) {
            arr3[index] = arr2[j];
            j++;
            index++;
        }
        return arr3;
    }

    static boolean isalpha(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        int si = 0;
        int ei = arr.length - 1;
        String a[] = MergeSort(arr, si, ei);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}