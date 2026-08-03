class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", ""); // replace all which are not a-z and A-Z and 0-9
        for(int i =0,j=str.length()-1;i<j;i++,j--){
            char ch = str.charAt(i);
            char ch1 = str.charAt(j);
            if(ch != ch1){
                return false;
            }
        }
        return true;
    }
}