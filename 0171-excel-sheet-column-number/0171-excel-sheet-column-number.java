class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length()-1;
        int ans = 0;
        int count = 0;
        while(n>=0){
            char ch = columnTitle.charAt(n);
            int num = ch - 'A' + 1;
            if(count!=0){
                ans += num*Math.pow(26,count);
            }else ans += num;
            n--;
            count++;
        }
        return ans;
    }
}