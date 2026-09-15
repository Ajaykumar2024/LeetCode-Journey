class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i=0;
        int count=0;
        while(i <= nums.size()-2){
            int j=i+1;
            while(j<=nums.size()-1){
                if(nums.get(i)+nums.get(j) < target){
                    count =count+1;

                }
                j++;
            }
            i++;
        }
        return count;
    }
}