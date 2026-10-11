class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            int k = i + 1;
            if(n%k==0) {
                int mul = nums[i]*nums[i];
                sum += mul;
            }
        }
        return sum;
    }
}