class Solution {
    private boolean isPalindrome(int i, int j, String s){
         while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        int count = 0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalindrome(i+1,j,s) || isPalindrome(i,j-1,s); // ishme main chiz hai right and left wale ko skip karne pe palindrome ban rha hai ki nhi
            } 
            i++;
            j--;
        }
        return true;
    }
}