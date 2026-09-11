// class Solution {
//     public int missingNumber(int[] nums) {
//         int xor = nums.length;
//         for(int i = 0;i<nums.length;i++){
//             xor ^= i; // a^a = 0 and a^0 = a
//             xor ^= nums[i];
//         }
//         return xor;
//     }
// }
//1^2^_^4
//1^2^3^4
//----------
//0^0^3^0 = 3 -> Misising number

//using cycle sort

class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i]<nums.length && nums[i]!=nums[nums[i]]) swap(nums,i,nums[i]);
            else i++;
        }

        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=j) return j;
        }
        return nums.length;
    }

    private void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}