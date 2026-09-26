class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        for (int i = len - 1; i < haystack.length(); i++) {
            int start = i - len + 1;
            String s = haystack.substring(start, i + 1);
            if (s.equals(needle)) {
                return start;
            }
        }
        return -1;
    }
}