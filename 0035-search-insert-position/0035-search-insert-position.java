class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        if(nums.length == 1){
            if(target > nums[i]){
                return 1;
            }
        }
        while(i<j){
            if(target > nums[i]){
                i++;
            }
            if(target < nums[j]){
                j--;
            }
            if(target > nums[j]){
                return j+1;
            }
            if(target < nums[i]){
                return i;
            }
            if(target == nums[i]){
                return i;
            }
            if(target == nums[j]){
                return j;
            }
        }
        return 0;
    }
}