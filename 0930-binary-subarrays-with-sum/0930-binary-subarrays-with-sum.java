class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost(int[] nums, int goal) {
        int j, i = 0, sum = 0, result = 0;
        for (j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum > goal && i <= j) {
                sum -= nums[i];
                i++;
            }
            result += j - i + 1;
        }
        return result;
    }
}