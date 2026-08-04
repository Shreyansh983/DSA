class Solution {
    public int removeDuplicates(int[] nums) {
        // Set<Integer> uniqueDuplicates = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     uniqueDuplicates.add(nums[i]);
        // }
        // List<Integer> uniqueElement = new ArrayList<>();
        // for(int i =0 ;i< nums.length;i++){
        //     if(uniqueDuplicates.contains(nums[i])){
        //         uniqueElement.add(nums[i]);
        //         uniqueDuplicates.remove(nums[i]);
        //     }
        // }
        // int k = uniqueElement.size();
        // int j =0;
        // for(int i : uniqueElement){
        //     nums[j++] = i;
        // }
        // return k;

        //optimal solution --------------------------
        // int i=0;
        // for(int j=1;j<arr.length;j++){
        //     if(arr[i]!=arr[j]){
        //         i++;
        //         arr[i]=arr[j];
        //     }
        // }
        // return i+1;

        int i = 0;
        int j = i+1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}