class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        int[] arr = new int[10];
        while(n!=0){
            int digit = n%10;
            arr[digit]++;
            n = n/10;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                sum+= i*arr[i];
            } 
        }
        return sum;
    }
}