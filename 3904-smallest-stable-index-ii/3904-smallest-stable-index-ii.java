class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int[] suffixMin = new int[nums.length];

        for(int i = nums.length-1;i>=0;i--){
            min = Math.min(min,nums[i]);
            suffixMin[i] = min;
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            int instability = max - suffixMin[i];
            if(instability<=k) return i;
        }
        return -1;
    }
}