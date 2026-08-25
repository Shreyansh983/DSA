class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length<=2){
            for(int num:nums){
                list.add(num);
            }
            return list;
        }
        int[] right = new int[nums.length];
        int max = nums[nums.length-1];
        for(int j = nums.length-1;j>=0;j--){
            max = Math.max(max,nums[j]);
            right[j] = max;
        }
        int leftMax = nums[0];
        list.add(leftMax);
        for(int i = 1;i<nums.length-1;i++){
            if(nums[i]>leftMax || nums[i]>right[i+1]) list.add(nums[i]);
            leftMax = Math.max(leftMax,nums[i]);
        }
        list.add(nums[nums.length-1]);
        return list;
    }
}