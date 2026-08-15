class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for(int i = 0;i<nums.length;i++){
            xor ^= i; // a^a = 0 and a^0 = a
            xor ^= nums[i];
        }
        return xor;
    }
}
//1^2^_^4
//1^2^3^4
//----------
//0^0^3^0 = 3 -> Misiising number
