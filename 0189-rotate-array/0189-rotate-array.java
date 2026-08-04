class Solution {
    public void rotate(int[] nums, int k) {

//--------- brute force approach --------------//        
        // while(k!=0){
        //     int lastNumber = nums[nums.length-1];
        //     System.out.println(lastNumber);
        //     for(int i = nums.length-1;i>0;i--)
        //     {
        //         nums[i] = nums[i-1];
        //     }
        //     nums[0] = lastNumber;
        //     k--;
        // }
//-------------optimal way -------------------//
    k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}