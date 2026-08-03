class Solution {
    private boolean isEven(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count%2==0;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(isEven(num)) count++;
        }
        return count;
    }
}