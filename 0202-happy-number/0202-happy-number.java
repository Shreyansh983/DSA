class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        if(n<10) return false;
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum = sum + (int)Math.pow(digit,2);
            n = n/10;
        }
        n = sum;
        return isHappy(n);
    }
}