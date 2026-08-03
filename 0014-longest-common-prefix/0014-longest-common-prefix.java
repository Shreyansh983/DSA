class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // lexographically sort ho jayega means dictionary wise
        String smaller = strs[0];
        String longer = strs[strs.length-1];
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<smaller.length();i++){
            if(smaller.charAt(i)!=longer.charAt(i)) break;
            ans.append(smaller.charAt(i));
        }
        return ans.toString();
    }
}