class Solution {
    public int countCommas(int n) {
        // only work for 1 <= n <= 10^5
        if(n<1000) return 0;
        return n-999;
    }
}