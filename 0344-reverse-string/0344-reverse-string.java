class Solution {
    private void swap(int a, int b, char[] s){
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(i<j){
            swap(i,j,s);
            i++;
            j--;
        }
    }
}