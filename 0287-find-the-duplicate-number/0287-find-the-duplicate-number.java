class Solution {
    //-------------Brute force approach -------- get TLE
    // here we can check the number as well instead of xor 
    // public int findDuplicate(int[] nums) {
    //     for(int i = 0;i<nums.length;i++){
    //         for(int j = i + 1;j<nums.length;j++){
    //             int num = nums[i]^nums[j];
    //             if(num==0) return nums[j];
    //         }
    //     }
    //     return -1;
    // }
    // 2nd approach use hashmap and whose value is more than 1 return it or we can use hashset as well
    // visited concept but here we are modifying the array
    public int findDuplicate(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            int a = Math.abs(nums[i]);
            if(nums[a]<0){
                return a;
            }
            nums[a] = -nums[a];
        }
        // System.out.println(Arrays.toString(nums));
        return nums.length;
    }
}