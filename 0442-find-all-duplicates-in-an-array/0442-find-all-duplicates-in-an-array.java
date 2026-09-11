class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            int curr = Math.abs(nums[i])-1;
            if(nums[curr]<0) list.add(curr+1);
            nums[curr] = -nums[curr];
        }
        return list;
    }
}