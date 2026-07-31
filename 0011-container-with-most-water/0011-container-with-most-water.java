class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int mostWater = 0;
        while(left<right){
            if(height[left]<=height[right]){
                leftMax = Math.max(leftMax,height[left]);
                mostWater = Math.max(mostWater,(right-left)*leftMax);
                left++;
            }else{
                rightMax = Math.max(rightMax,height[right]);
                mostWater = Math.max(mostWater,(right-left)*rightMax);
                right--;
            }
        }
        return mostWater;
    }
}