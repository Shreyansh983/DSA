class Solution {
    public int subarraySum(int[] nums, int k) {
        // brute force
        // int count = 0;
        // int n = nums.length;

        // for(int i=0; i<n; i++) {
        //     int sum = 0;
        //     for(int j=i; j<n; j++) {
        //         sum += nums[j];

        //         if(sum == k) {
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // optimal approach
        int sum = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i< nums.length ; i++){
            sum += nums[i];
            int diff = sum - k;
            if(map.containsKey(diff)){
                result += map.get(diff);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return result;
    }
}