class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        char[] arr = s.toCharArray();
        int count = 0,i = 0;
        int min = Integer.MAX_VALUE;
        String ans = "";
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == '1')
                count++;
            while (i < j && (count > k || arr[i] == '0')) {
                if (arr[i] == '1')
                    count--;
                i++;
            }
            if (count == k) {
                String sb = s.substring(i,j+1);
                if (sb.length() < min) {
                    min = sb.length();
                    ans = sb;
                } else if (sb.length() == min) {
                    if (sb.compareTo(ans) < 0) { //lexographically smallest
                        ans = sb;
                    }
                }
            }
        }
        return ans;
    }
}