class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i]<min){
                min = nums[i];
                minIndex = i;
            }
        }
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        // Remove both from the front
        int fromFront = right + 1;

        // Remove both from the back
        int fromBack = nums.length - left;

        // Remove one from front and the other from back
        int mixed = (left + 1) + (nums.length - right);

        return Math.min(fromFront, Math.min(fromBack, mixed));
    }
}