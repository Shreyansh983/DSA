class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int a = Math.abs(nums[i])-1;
            if(nums[a]<0) list.add(a+1);
            nums[a] = -nums[a];
        }
        System.out.println(Arrays.toString(nums));
        return list;
    }
}