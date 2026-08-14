class Solution {
    public boolean isPowerOfTwo(int n) {
    //    if(n==1){
    //         return true;
    //     }
    //     if(n<=0)
    //     return false;
    //     if(n%2!=0)
    //         return false;
    //     else{
    //         while(n>1){
    //             if(n%2!=0) return false;
    //             else
    //                 n = n/2;
    //         }
    //     }
    //     return true;
    // Approach 2
    // if(n<=0) return false;
    // double logResult = Math.log(n)/Math.log(2);
    // return Math.abs(logResult - Math.round(logResult)) < 1e-10;
    // Approach 3
    int max = (int)Math.pow(2,30);
    return n > 0 && max % n == 0;
    }
}