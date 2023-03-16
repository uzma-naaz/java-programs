class TrapwaterDSA {
    public static void trapwater(int height[]) {
        int min = Integer.MAX_VALUE;
        // auxilliary array for left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
            System.out.print("[" + leftMax[i] + "]");

        }
        System.out.println();
        // auxiliary array for right max boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
            System.out.print("[" + rightMax[i] + "]");
        }
        System.out.println();
        int trapwater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);

            trapwater += waterLevel - height[i];
        }
        System.out.println("trapped water " + trapwater);

    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trapwater(height);
    }
}