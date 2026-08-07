class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        /**-------Brute Force------------
        int sum = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            sum = 0;
            for(int j =i;j<nums.length;j++){
                sum += nums[j];
                if(sum%k==0) count++;
            }
        }
        return count;
        */
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int result = 0;
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            int mod = sum % k;
            if (mod < 0) {
                mod += k;
            }
            if(map.containsKey(mod)){
                result += map.get(mod);
            }
            map.put(mod, map.getOrDefault(mod, 0)+1);
        }
        return result;
    }
}