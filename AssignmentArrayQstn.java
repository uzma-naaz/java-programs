class AssignmentArrayQstn {
    public static boolean TwiceNum(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;

                }
            }
        }
        return false;
    }

    public static int RotationArr(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid] && target >= nums[left]) { // for left sorted array
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int tripletArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println(nums[i]);

                    }
                }

            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        // int target = 8;
        // System.out.print(TwiceNum(nums));
        // System.out.print(RotationArr(nums, target));

        System.out.println(tripletArray(nums));

    }
}