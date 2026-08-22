class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int tmp = n;
        int product = digitProduct(temp);
        int sum = digitSum(tmp);
        int total = sum + product;
        if(n%total==0) return true;
        return false;
    }
    private int digitProduct(int n){
        int product = 1;
        while(n!=0){
            product *= n%10;
            n /= 10;
        }
        return product;
    }
    private int digitSum(int n){
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}