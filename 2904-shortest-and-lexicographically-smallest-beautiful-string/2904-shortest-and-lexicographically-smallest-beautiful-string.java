class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        char[] arr = s.toCharArray();
        int count = 0,i = 0;
        int min = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == '1')
                count++;
            sb.append(arr[j]);
            while (i < j && (count > k || arr[i] == '0')) {
                if (arr[i] == '1')
                    count--;
                    sb.deleteCharAt(0);
                i++;
            }
            // System.out.println(sb);
            if (count == k) {
                if (sb.length() < min) {
                    min = sb.length();
                    ans = new StringBuilder(sb);
                } else if (sb.length() == min) {
                    if (sb.toString().compareTo(ans.toString()) < 0) {
                        ans = new StringBuilder(sb);
                    }
                }
            }
        }
        return ans.toString();
    }
}