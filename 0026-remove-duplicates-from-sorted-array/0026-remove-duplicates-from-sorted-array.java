class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0,
            j=1, 
            unique=1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                j++;
                continue;
            }
            i=i+1;
            nums[i]=nums[j];
            unique++;
            j++;

        }
        return unique;
    }
}