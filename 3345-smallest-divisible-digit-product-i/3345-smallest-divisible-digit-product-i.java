class Solution {
    public int smallestNumber(int n, int t) {
        /** -----Recusrsive------------
        int num = 1;
        int temp = n;
        while(temp!=0){
            num *= temp%10;
            temp /= 10;
        }
        int rem = num%t;
        
        if(rem==0) return n;
        return smallestNumber(n+1,t);
        */
        // Iterative
        while (true) {
            int num = 1;
            int temp = n;
            while (temp != 0) {
                num *= temp % 10;
                temp /= 10;
            }
            int rem = num % t;

            if (rem == 0)
                return n;

            n++;
        }

    }
}