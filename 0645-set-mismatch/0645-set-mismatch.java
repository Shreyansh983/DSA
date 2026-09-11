class Solution {
    public int[] findErrorNums(int[] nums) {
        int rep = 0;
        int dup = 0;
        for(int i = 0;i<nums.length;i++){
            int curr = Math.abs(nums[i])-1;
            if(nums[curr]<0) rep = curr+1;
            else nums[curr] = -nums[curr];
        }

        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0) dup = i+1;
        }
        return new int[]{rep,dup};
    }
}