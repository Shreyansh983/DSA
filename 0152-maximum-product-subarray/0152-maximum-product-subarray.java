class Solution {
    public int maxProduct(int[] nums) {
        int prefixMul = 1;
        int suffixMul = 1;
        int maxMul = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            prefixMul *= nums[i];
            suffixMul *= nums[nums.length-1-i];
            maxMul = Math.max(maxMul,Math.max(prefixMul,suffixMul));

            if(prefixMul == 0) prefixMul = 1;
            if (suffixMul == 0) suffixMul = 1;
        }
        return maxMul;
    }
}