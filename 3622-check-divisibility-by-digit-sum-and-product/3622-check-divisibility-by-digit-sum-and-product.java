class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int total = digitTotal(temp);;
        if(n%total==0) return true;
        return false;
    }
    private int digitTotal(int n){
        int product = 1;
        int sum = 0;
        while(n!=0){
            product *= n%10;
            sum += n%10;
            n /= 10;
        }
        return product+sum;
    }
}