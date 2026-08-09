class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int maxWater = 0;
        int leftMax = 0;
        int rightMax = 0;
        // int[] right = new int[n];
        // int max = 0;
        // for (int i = n - 1; i >= 0; i--) {
        //     max = Math.max(max, height[i]);
        //     right[i] = max;
        // }
        // for (int i = 0; i < n; i++) {
        //     rightMax = right[i];
        //     leftMax = Math.max(leftMax, height[i]);
        //     int waterLevel = Math.min(rightMax, leftMax);
        //     int water = waterLevel - height[i];
        //     if (water > 0)
        //         maxWater += water;
        // }
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (height[left] <= height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                maxWater += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                maxWater += rightMax - height[right];
                right--;
            }
        }
        return maxWater;
    }
}