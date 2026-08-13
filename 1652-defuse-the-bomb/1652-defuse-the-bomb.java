class Solution {
    public int[] decrypt(int[] code, int k) {
        int i =0;
        int j =0;
        int[] ans = new int[code.length];
        while(i<code.length){
            j = i+1;
            int count = 0;
            int sum = 0;
            if(k==0)    ans[i] = 0;
            if(k>0){
                while(count<k){
                    j = j%code.length;
                    sum += code[j++];
                    count++;
                }
                ans[i] = sum;
            }
            if(k<0){
                j = i-1;
                while(count<Math.abs(k)){
                    j = (j % code.length + code.length) % code.length;
                    sum += code[j--];
                    count++;
                }
                ans[i] = sum;
            }
            i++;
        }
        return ans;
    }
}