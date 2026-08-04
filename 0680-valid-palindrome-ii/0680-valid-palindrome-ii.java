class Solution {
    private boolean isPalindrome(int i, int j, StringBuilder sb){
         while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length()-1;
        int count = 0;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return isPalindrome(i+1,j,sb) || isPalindrome(i,j-1,sb);
            } 
            i++;
            j--;
        }
        return true;
    }
}