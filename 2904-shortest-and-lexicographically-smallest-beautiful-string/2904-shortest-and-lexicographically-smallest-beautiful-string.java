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
                String window = s.substring(i,j+1);
                if (window.length() < min) {
                    min = window.length();
                    ans = window;
                } else if (window.length() == min) {
                    if (window.compareTo(ans) < 0) { //lexographically smallest
                        ans = window;
                    }
                }
            }
        }
        return ans;
    }
}