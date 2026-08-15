class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = nums[0];
        boolean checkZero = true;
        for(int j = 1;j<nums.length;j++){
            xor = xor^nums[j];
            if(nums[j]!=0) checkZero = false;
        }
        if(xor!=0) return nums.length;
        if(checkZero) return 0;
        return nums.length-1;
    }
}