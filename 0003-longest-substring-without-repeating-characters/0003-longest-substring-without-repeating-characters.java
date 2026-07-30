class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0;
        int maxCount = 0;
        Set<Character> set = new HashSet<>();
        for(int j = 0;j < n;j++){ // Right pointer se expand
            while(!set.add(s.charAt(j))){ // left pointer tab tak move ho raha hai jab tak duplicate clear na ho
                set.remove(s.charAt(i));  // Set always contains unique characters of current window [i, j]
                i++;
            }
            maxCount = Math.max(maxCount,j-i+1);
        }
        return maxCount;
    }
}