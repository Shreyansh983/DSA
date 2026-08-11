class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String s1 = arr[arr.length - 1];
        return s1.length();
    }
}