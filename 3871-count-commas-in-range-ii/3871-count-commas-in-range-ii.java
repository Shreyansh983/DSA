class Solution {
    public long countCommas(long n) {
        long count = 0;
        if(n<1000) return count;
        if(n>=1000 && n<=999999) count = n-999;
        if(n>999999){
            count = n - 999;
            long num = n - 999999;
            count += num;
        }
        if(n>999999999){
            count = n - 999;
            long num = n - 999999;
            long num2 = n - 999999999;
            count += num + num2;
        }
        if(n > 999999999999L){
            count = n - 999;
            long num = n - 999999;
            long num2 = n - 999999999;
            long num3 = n - 999999999999L;
            count += num + num2 + num3;
        }
        if(n > 999999999999999L){
            count = n - 999;
            long num = n - 999999;
            long num2 = n - 999999999;
            long num3 = n - 999999999999L;
            long num4 = n - 999999999999999L;
            count += num + num2 + num3;
        }
        if(n>=1000000000000000L) count++;
        return count;
    }
}