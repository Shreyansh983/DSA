class Solution {
    public String mergeAlternately(String s1, String s2) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while(i < s1.length() || j < s2.length()){
            if(i<s1.length())   sb.append(s1.charAt(i++));
            if(j<s2.length())    sb.append(s2.charAt(j++));
        }
        return sb.toString();
    }
}