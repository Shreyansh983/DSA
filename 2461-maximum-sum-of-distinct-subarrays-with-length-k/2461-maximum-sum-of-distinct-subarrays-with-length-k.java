class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0;
        long sum = 0;
        long max = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
            while (j - i + 1 > k) {
                count.put(nums[i], count.get(nums[i]) - 1);
                if (count.get(nums[i]) == 0) {
                    count.remove(nums[i]);
                }
                sum -= nums[i];
                i++;
            }
            if (count.size() == j - i + 1 && j - i + 1 == k) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}