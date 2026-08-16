class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int freq = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j]==1){
                freq++;
            }else{
                freq = 0;
            }
            ans = Math.max(ans,freq);
        }
        return ans;
    }
}